package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

public class PorcentajeDeAvance implements ValueObject<Double> {
    private final Double valor;

    public PorcentajeDeAvance(Double valor){
        this.valor = valor;
    }

    public Double getPorcentajeDeAvance(){
        return this.valor;
    }

    @Override
    public Double value(){
        return valor;
    }
}
