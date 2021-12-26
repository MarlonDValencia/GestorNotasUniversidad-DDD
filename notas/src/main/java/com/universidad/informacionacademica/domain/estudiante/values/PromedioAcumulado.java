package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;

public class PromedioAcumulado implements ValueObject<Double> {
    private final Double valor;

    public PromedioAcumulado(Double valor){
        this.valor = valor;
    }

    public Double getPromedioAcumulado(){
        return this.valor;
    }

    @Override
    public Double value(){
        return valor;
    }
}
