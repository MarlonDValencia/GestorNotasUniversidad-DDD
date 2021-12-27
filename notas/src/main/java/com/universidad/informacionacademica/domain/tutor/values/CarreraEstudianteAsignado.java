package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CarreraEstudianteAsignado implements ValueObject<String>{
    private final String value;

    public CarreraEstudianteAsignado(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getCarreraEstudianteAsignado(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
