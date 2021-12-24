package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<String> {
    private final String value;

    public Estado(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getEstado(){
        return value;
    }

    @Override
    public String value(){
        return value;
    }
}
