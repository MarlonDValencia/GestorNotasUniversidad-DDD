package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.Identity;

public class IdFacultad extends Identity {
    public IdFacultad(String value) {
        super(value);
    }

    public IdFacultad() {
    }

    public static IdFacultad of(String value) {
        return new IdFacultad(value);
    }
}
