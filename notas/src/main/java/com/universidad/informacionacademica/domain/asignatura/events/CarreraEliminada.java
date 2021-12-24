package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

public class CarreraEliminada extends DomainEvent {
    private final IdFacultad idFacultad;

    public CarreraEliminada(IdCarrera idCarrera, IdFacultad idFacultad) {
        super("universidad.informacionacademica.carreraeliminada");
        this.idFacultad = idFacultad;
    }

    public IdFacultad getIdFacultad() {
        return idFacultad;
    }
}
