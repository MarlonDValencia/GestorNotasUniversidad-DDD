package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.Identity;

public class IdPensum extends Identity {
    public IdPensum(String value) {
        super(value);
    }

    public IdPensum() {
    }

    public static IdEstudiante of(String value) {
        return new IdEstudiante(value);
    }
}
