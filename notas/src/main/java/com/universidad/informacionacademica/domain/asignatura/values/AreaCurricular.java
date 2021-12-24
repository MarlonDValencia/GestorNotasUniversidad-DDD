package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AreaCurricular implements ValueObject<String>{
    private final String value;

    public AreaCurricular(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getAreaCurricular(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
