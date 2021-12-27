package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreTutor implements ValueObject<String>{
    private final String value;

    public NombreTutor(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreTutor(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
