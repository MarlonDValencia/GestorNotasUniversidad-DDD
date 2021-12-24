package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nota implements ValueObject<Double> {
    private final Double value;

    public Nota(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    public Double getNota() {
        return this.value;
    }

    @Override
    public Double value() {
        return value;
    }
}
