package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;

public class TurnitinTestHecho extends DomainEvent {
    public TurnitinTestHecho(CasoDeEstudio casoDeEstudio) {
        super("");
    }
}
