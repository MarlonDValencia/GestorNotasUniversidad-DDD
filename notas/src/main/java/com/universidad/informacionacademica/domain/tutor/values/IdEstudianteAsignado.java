package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.Identity;

public class IdEstudianteAsignado extends Identity {
    public IdEstudianteAsignado(String value) {
        super(value);
    }

    public IdEstudianteAsignado() {
    }

    public static IdEstudianteAsignado of(String value) {
        return new IdEstudianteAsignado(value);
    }
}
