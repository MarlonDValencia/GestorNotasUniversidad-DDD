package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoTesis implements ValueObject<String>{
    private final String value;

    public EstadoTesis(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getEstadoTesis(){
        return this.value;
    }

    @Override
    public String value(){
        return value;
    }
}
