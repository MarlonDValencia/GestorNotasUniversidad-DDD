package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreAsignatura implements ValueObject<String> {
    private final String value;

    public NombreAsignatura(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreAsignatura(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
