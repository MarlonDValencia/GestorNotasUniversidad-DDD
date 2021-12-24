package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreDocente implements ValueObject<String> {
    private final String value;

    public NombreDocente(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getNombreDocente(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
