package com.universidad.informacionacademica.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.FechaLimite;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class PlazoAlargado extends DomainEvent {
    public PlazoAlargado(IdActividad idActividad, FechaLimite fechaLimite) {
        super("");
    }
}
