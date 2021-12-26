package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreEstudiante implements ValueObject<String> {
    private final String value;

    public NombreEstudiante(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreEstudiante(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
