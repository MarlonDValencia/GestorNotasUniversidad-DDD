package com.universidad.informacionacademica.domain.estudiante.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;

public class MateriaCancelada extends DomainEvent {
    private final Asignatura asignatura;
    private final Estudiante estudiante;

    public MateriaCancelada(Asignatura asignatura, Estudiante estudiante){
        super("universidad.informacionacademica.materiacancelada");
        this.asignatura = asignatura;
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
