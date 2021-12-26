package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCarrera implements ValueObject<String> {
    private final String value;

    public NombreCarrera(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreCarrera(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
