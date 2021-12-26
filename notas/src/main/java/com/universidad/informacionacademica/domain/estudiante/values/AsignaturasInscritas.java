package com.universidad.informacionacademica.domain.estudiante.values;

import co.com.sofka.domain.generic.ValueObject;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;

import java.util.Set;

public class AsignaturasInscritas implements ValueObject<Set<Asignatura>>{
    private final Set<Asignatura> asignaturasInscritas;

    public AsignaturasInscritas(Set<Asignatura> asignaturasInscritas){
        this.asignaturasInscritas = asignaturasInscritas;
    }

    public Set<Asignatura> getAsignaturasInscritas(){
        return asignaturasInscritas;
    }

    @Override
    public Set<Asignatura> value(){
        return value();
    }
}
