package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.NombreAsignatura;
import com.universidad.informacionacademica.domain.estudiante.events.MateriaCancelada;
import com.universidad.informacionacademica.domain.estudiante.events.MateriaCursadaAgregada;
import com.universidad.informacionacademica.domain.estudiante.events.MateriaInscrita;
import com.universidad.informacionacademica.domain.estudiante.values.*;

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
    public void inscribirMateria(Asignatura asignatura){
        appendChange(new MateriaInscrita(asignatura)).apply();
    }
    public void cancelarMateria(Asignatura asignatura){
        appendChange(new MateriaCancelada(asignatura,this)).apply();
    }

    public void agregarMateriaCursada(Asignatura asignatura){
        appendChange(new MateriaCursadaAgregada(asignatura)).apply();
    }

    public void consultarHistoriaAcademica(){
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
