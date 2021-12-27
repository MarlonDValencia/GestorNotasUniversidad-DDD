package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;

public class EstudianteDesvinculado extends DomainEvent {
    protected EstudianteAsignado estudianteAsignado;
    public EstudianteDesvinculado(EstudianteAsignado estudianteAsignado) {
        super("universidad.informacionacademica.estudiantedesvinculado");
        this.estudianteAsignado = estudianteAsignado;
    }

    public EstudianteAsignado getEstudianteAsignado() {
        return estudianteAsignado;
    }
}
