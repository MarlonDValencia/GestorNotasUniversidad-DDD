package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreFacultad implements ValueObject<String> {
    private final String value;

    public NombreFacultad(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreFacultad(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
