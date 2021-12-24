package com.universidad.informacionacademica.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.FechaLimite;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class PlazoAlargado extends DomainEvent {
    private final IdActividad idActividad;
    private final FechaLimite fechaLimiteLimite;
    public PlazoAlargado(IdActividad idActividad, FechaLimite fechaLimite) {
        super("universidad.informacionacademica.plazoalargado");
        this.fechaLimiteLimite = fechaLimite;
        this.idActividad = idActividad;
    }

    public IdActividad getIdActividad() {
        return idActividad;
    }

    public FechaLimite getFechaLimiteLimite() {
        return fechaLimiteLimite;
    }
}
