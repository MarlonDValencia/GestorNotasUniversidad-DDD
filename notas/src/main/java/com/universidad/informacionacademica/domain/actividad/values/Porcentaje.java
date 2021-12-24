package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Porcentaje implements ValueObject<Double>{
    private final Double valor;

     public Porcentaje(Double valor){
         this.valor = Objects.requireNonNull(valor);
     }

     public Double getPorcentaje(){
         return valor;
     }

     @Override
    public Double value(){
         return valor;
     }
}
