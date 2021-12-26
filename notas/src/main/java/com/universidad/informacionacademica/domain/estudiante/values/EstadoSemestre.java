package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoSemestre implements ValueObject<String> {
    private final String value;

    public EstadoSemestre(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getEstadoSemestre(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
