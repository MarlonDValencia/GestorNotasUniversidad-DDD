package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;
import com.universidad.informacionacademica.domain.estudiante.Carrera;

import java.util.Objects;
import java.util.Set;

public class Carreras implements ValueObject<Set<Carrera>> {
    private final Set<Carrera> Carreras;

    public Carreras(Set<Carrera> Carreras){
        this.Carreras = Objects.requireNonNull(Carreras);
    }

    public Set<Carrera> getCarreras(){
        return Carreras;
    }

    @Override
    public Set<Carrera> value(){
        return value();
    }
}
