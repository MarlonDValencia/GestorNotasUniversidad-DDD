package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreActividad implements ValueObject<String>{
    private final String value;

    public NombreActividad(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreActividad(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
