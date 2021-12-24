package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Miembros implements ValueObject<Set<String>> {
    private final Set<String> Miembros;

    public Miembros(Set<String> Miembros){
        this.Miembros = Objects.requireNonNull(Miembros);
    }

    public Set<String> getTipoDeMateria(){
        return Miembros;
    }

    @Override
    public Set<String> value(){
        return value();
    }
}
