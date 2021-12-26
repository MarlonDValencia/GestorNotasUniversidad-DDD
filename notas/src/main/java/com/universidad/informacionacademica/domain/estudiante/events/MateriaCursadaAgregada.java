package com.universidad.informacionacademica.domain.estudiante.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;

public class MateriaCursadaAgregada extends DomainEvent {
    private final Asignatura materiaCursada;
    public MateriaCursadaAgregada(Asignatura asignatura){

    }
}
