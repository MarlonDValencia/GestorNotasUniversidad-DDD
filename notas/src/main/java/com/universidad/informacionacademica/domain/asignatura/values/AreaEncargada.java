package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
public class AreaEncargada implements ValueObject<String> {
    private final String value;

    public AreaEncargada(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getAreaEncargada(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
