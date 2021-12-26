package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.estudiante.values.IdEstudiante;
import com.universidad.informacionacademica.domain.estudiante.values.NombreEstudiante;
import com.universidad.informacionacademica.domain.estudiante.values.Semestre;

import java.util.Set;

public class EstudianteCreado extends DomainEvent {
    protected NombreEstudiante nombreEstudiante;
    protected Semestre semestre;
    protected Set<Asignatura> asignaturasInscritas;
    protected Carrera carrera;
    protected Pensum pensum;
    protected HistoriaAcademica historiaAcademica;

    public EstudianteCreado(IdEstudiante idEstudiante, NombreEstudiante nombreEstudiante, Semestre semestre, Set<Asignatura> asignaturasInscritas, Carrera carrera, Pensum pensum, HistoriaAcademica historiaAcademica) {
        super("universidad.informacionacademica.EstudianteCreado");
        this.nombreEstudiante = nombreEstudiante;
        this.semestre = semestre;
        this.asignaturasInscritas = asignaturasInscritas;
        this.carrera = carrera;
        this.pensum = pensum;
        this.historiaAcademica = historiaAcademica;
    }

    public NombreEstudiante getNombreEstudiante() {
        return nombreEstudiante;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public Set<Asignatura> getAsignaturasInscritas() {
        return asignaturasInscritas;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Pensum getPensum() {
        return pensum;
    }

    public HistoriaAcademica getHistoriaAcademica() {
        return historiaAcademica;
    }
}
