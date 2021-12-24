package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

public class CarreraAbierta extends DomainEvent {
    public CarreraAbierta(IdCarrera idCarrera, IdFacultad idFacultad) {
        super("");
    }
}
