package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Incidencia implements ValueObject<Integer>{
    private final Integer value;

    public Incidencia(Integer value){
        this.value = Objects.requireNonNull(value);
    }

    public Integer getIncidencia(){
        return value;
    }

    @Override
    public Integer value(){
        return value;
    }
}
