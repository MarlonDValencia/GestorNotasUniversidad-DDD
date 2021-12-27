package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.Identity;

public class IdTutor extends Identity {
    public IdTutor(String value) {
        super(value);
    }

    public IdTutor() {
    }

    public static IdTutor of(String value) {
        return new IdTutor(value);
    }
}
