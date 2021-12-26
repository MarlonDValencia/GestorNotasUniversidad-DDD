package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.Identity;

public class IdCarrera extends Identity {
    public IdCarrera(String value) {
        super(value);
    }

    public IdCarrera() {
    }

    public static IdCarrera of(String value) {
        return new IdCarrera(value);
    }
}
