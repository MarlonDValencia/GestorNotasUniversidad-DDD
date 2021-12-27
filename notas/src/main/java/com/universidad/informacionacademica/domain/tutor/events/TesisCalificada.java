package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;

public class TesisCalificada extends DomainEvent {
    protected TesisAsignada tesisAsignada;
    public TesisCalificada(TesisAsignada tesisAsignada) {
        super("universidad.informacionacademica.tesiscalificada");
        this.tesisAsignada = tesisAsignada;
    }
    public TesisAsignada getTesisAsignada() {
        return tesisAsignada;
    }
}
