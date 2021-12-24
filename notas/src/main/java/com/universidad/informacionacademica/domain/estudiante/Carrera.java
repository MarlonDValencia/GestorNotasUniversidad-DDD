package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

public class Carrera extends AggregateEvent<IdCarrera> {
    /**
     * Instantiates a new Aggregate event.
     *
     * @param entityId the entity id
     */
    public Carrera(IdCarrera entityId) {
        super(entityId);
    }
}
