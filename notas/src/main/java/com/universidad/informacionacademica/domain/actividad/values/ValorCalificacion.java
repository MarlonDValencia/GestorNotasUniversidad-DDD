package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.stream.BaseStream;

public class ValorCalificacion implements ValueObject<Double> {
    private final Double valor;

    public ValorCalificacion(Double valor){
        this.valor = Objects.requireNonNull(valor);
    }

    public Double getValorCalificacion(){
        return valor;
    }

    @Override
    public Double value(){
        return valor;
    }
}
