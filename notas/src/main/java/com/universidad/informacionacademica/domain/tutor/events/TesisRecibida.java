package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;

public class TesisRecibida extends DomainEvent {
    public TesisRecibida(EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada) {
        super("");
    }
}
