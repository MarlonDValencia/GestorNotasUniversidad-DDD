package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.estudiante.Carrera;

public class CarreraAbierta extends DomainEvent {
    private final Carrera carrera;

    public CarreraAbierta(Carrera carrera) {
        super("universidad.informacionacademica.carreraabierta");
        this.carrera = carrera;
    }

    public Carrera getCarrera() {
        return carrera;
    }
}
