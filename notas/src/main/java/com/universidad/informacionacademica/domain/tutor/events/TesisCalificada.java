package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;

public class TesisCalificada extends DomainEvent {
    public TesisCalificada(TesisAsignada tesisAsignada) {
        super("");
    }
}
