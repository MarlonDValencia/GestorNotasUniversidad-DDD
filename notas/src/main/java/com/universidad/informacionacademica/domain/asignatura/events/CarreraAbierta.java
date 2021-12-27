package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

import java.util.UUID;

public class CarreraAbierta extends DomainEvent {
    private final IdAsignatura idAsignatura;
    private final Carrera carrera;
    private final IdFacultad idFacultad;
    public CarreraAbierta(IdAsignatura idAsignatura, Carrera carrera, IdFacultad idFacultad) {
        super("universidad.informacionacademica.carreraabierta");
        this.idAsignatura = idAsignatura;
        this.carrera = carrera;
        this.idFacultad = idFacultad;
    }

    public IdAsignatura getIdAsignatura() {
        return idAsignatura;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public IdFacultad getIdFacultad() {
        return idFacultad;
    }
}
