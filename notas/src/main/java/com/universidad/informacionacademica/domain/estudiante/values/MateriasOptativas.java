package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;

import java.util.Set;

public class MateriasOptativas implements ValueObject<Set<Asignatura>> {
    private final Set<Asignatura> materiasCursadas;

    public MateriasOptativas(Set<Asignatura> materiasCursadas){
        this.materiasCursadas = materiasCursadas;
    }

    public Set<Asignatura> getMateriasOptativas(){
        return materiasCursadas;
    }

    @Override
    public Set<Asignatura> value(){
        return value();
    }
}
