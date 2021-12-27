package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreEstudianteAsignado implements ValueObject<String> {
    private final String value;

    public NombreEstudianteAsignado(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreEstudianteAsignado(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
