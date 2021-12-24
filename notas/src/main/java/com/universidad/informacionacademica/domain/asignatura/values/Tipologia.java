package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipologia implements ValueObject<String> {
    private final String tipoDeMateria;

    public Tipologia(String tipoDeMateria){
        this.tipoDeMateria = Objects.requireNonNull(tipoDeMateria);
    }

    public String getTipoDeMateria(){
        return tipoDeMateria;
    }

    @Override
    public String value(){
        return value();
    }
}
