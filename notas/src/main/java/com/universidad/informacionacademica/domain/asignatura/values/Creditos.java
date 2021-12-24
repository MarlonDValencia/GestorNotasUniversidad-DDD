package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Creditos implements ValueObject<Integer> {
    private final Integer value;

    public Creditos(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    public Integer getCreditos(){
        return this.value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
