package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.Identity;

public class IdHistoriaAcademica extends Identity {
    public IdHistoriaAcademica(String value) {
        super(value);
    }

    public IdHistoriaAcademica() {
    }

    public static IdHistoriaAcademica of(String value) {
        return new IdHistoriaAcademica(value);
    }
}
