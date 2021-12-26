package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

public class Semestre implements ValueObject<Integer>{
    private final Integer valor;

    public Semestre(Integer valor){
        this.valor = valor;
    }

    public Integer getNumeroSemestre(){
        return this.valor;
    }

    @Override
    public Integer value(){
        return valor;
    }
}
