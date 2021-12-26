package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroDeCreditos implements ValueObject<Integer> {
    private final Integer valor;

    public NumeroDeCreditos(Integer valor){
        this.valor = valor;
    }

    public Integer getNumeroDeCreditos(){
        return this.valor;
    }

    @Override
    public Integer value(){
        return valor;
    }
}
