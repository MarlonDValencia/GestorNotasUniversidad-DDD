package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.events.*;
import com.universidad.informacionacademica.domain.estudiante.values.*;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Estudiante extends AggregateEvent<IdEstudiante> {
    protected NombreEstudiante nombreEstudiante;
    protected Semestre semestre;
    protected Set<Asignatura> asignaturasInscritas;
    protected Carrera carrera;
    protected Pensum pensum;
    protected HistoriaAcademica historiaAcademica;

    public Estudiante(IdEstudiante idEstudiante,NombreEstudiante nombreEstudiante,Semestre semestre,Set<Asignatura> asignaturasInscritas,Carrera carrera,Pensum pensum,HistoriaAcademica historiaAcademica){
        super(idEstudiante);
        subscribe(new EstudianteChange(this));
        appendChange(new EstudianteCreado(idEstudiante,nombreEstudiante,semestre,asignaturasInscritas,carrera,pensum,historiaAcademica)).apply();
    }

    private Estudiante(IdEstudiante idEstudiante){
        super(idEstudiante);
        subscribe(new EstudianteChange(this));
    }

    public static Estudiante from(IdEstudiante idEstudiante, List<DomainEvent> events){
        var estudiante = new Estudiante((idEstudiante));
        events.forEach(estudiante::applyEvent);
        return estudiante;
    }
    public void inscribirMateria(Asignatura asignatura, Estudiante estudiante){
        appendChange(new MateriaInscrita(asignatura, estudiante)).apply();
    }
    public void cancelarMateria(Asignatura asignatura, Estudiante estudiante){
        appendChange(new MateriaCancelada(asignatura,estudiante)).apply();
    }

    public void agregarMateriaCursada(Asignatura asignatura, Nota nota){
        appendChange(new MateriaCursadaAgregada(asignatura, nota)).apply();
    }

    public void consultarHistoriaAcademica(HashMap<Asignatura, Nota> materiasCursadas, PorcentajeDeAvance porcentajeDeAvance, Estudiante estudiante){
        appendChange(new HistoriaAcademicaConsultada(materiasCursadas,porcentajeDeAvance,estudiante));
    }

    public NombreEstudiante nombreEstudiante() {
        return nombreEstudiante;
    }

    public Semestre semestre() {
        return semestre;
    }

    public Set<Asignatura> asignaturasInscritas() {
        return asignaturasInscritas;
    }

    public Carrera carrera() {
        return carrera;
    }

    public Pensum pensum() {
        return pensum;
    }

    public HistoriaAcademica historiaAcademica() {
        return historiaAcademica;
    }
}
