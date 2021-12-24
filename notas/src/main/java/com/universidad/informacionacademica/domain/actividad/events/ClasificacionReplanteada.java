package com.universidad.informacionacademica.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.Clasificacion;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class ClasificacionReplanteada extends DomainEvent {
    private final IdActividad idActividad;
    private final Clasificacion clasificacion;
    public ClasificacionReplanteada(IdActividad idActividad, Clasificacion clasificacion) {
        super("universidad.informacionacademica.clasificacionreplanteada");
        this.clasificacion = clasificacion;
        this.idActividad = idActividad;
    }

    public IdActividad getIdActividad() {
        return idActividad;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
