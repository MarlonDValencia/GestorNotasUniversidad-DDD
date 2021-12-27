package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;

public class EstudianteDesvinculado extends DomainEvent {
    public EstudianteDesvinculado(EstudianteAsignado estudianteAsignado) {
        super("");
    }
}
