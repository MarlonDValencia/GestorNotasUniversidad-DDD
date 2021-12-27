package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.Identity;

public class IdTesisAsignada extends Identity {
    public IdTesisAsignada(String value) {
        super(value);
    }

    public IdTesisAsignada() {
    }

    public static IdTesisAsignada of(String value) {
        return new IdTesisAsignada(value);
    }
}
