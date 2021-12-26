package com.universidad.informacionacademica.domain.estudiante.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;

public class MateriaInscrita extends DomainEvent {
    private final Asignatura asignatura;
    public MateriaInscrita(Asignatura asignatura){
        super("universidad.informacionacademica.materiainscrita");
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }
}
