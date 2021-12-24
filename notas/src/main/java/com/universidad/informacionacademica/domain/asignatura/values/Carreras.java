package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Carreras implements ValueObject<Set<String>> {
    private final Set<String> Carreras;

    public Carreras(Set<String> Carreras){
        this.Carreras = Objects.requireNonNull(Carreras);
    }

    public Set<String> getTipoDeMateria(){
        return Carreras;
    }

    @Override
    public Set<String> value(){
        return value();
    }
}
