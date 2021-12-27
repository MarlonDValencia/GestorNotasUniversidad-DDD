package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;

public class TurnitinTestHecho extends DomainEvent {
    protected CasoDeEstudio casoDeEstudio;
    public TurnitinTestHecho(CasoDeEstudio casoDeEstudio) {
        super("universidad.informacionacademica.turnitintesthecho");
        this.casoDeEstudio = casoDeEstudio;
    }

    public CasoDeEstudio getCasoDeEstudio() {
        return casoDeEstudio;
    }
}
