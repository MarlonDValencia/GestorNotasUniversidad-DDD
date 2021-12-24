package com.universidad.informacionacademica.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.Calificacion;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class CalificacionEditada extends DomainEvent {
    private final IdActividad idActividad;
    private final Calificacion calificacion;
    public CalificacionEditada(IdActividad idActividad, Calificacion calificacion) {
        super("universidad.informacionacademica.asignaturacreada");
        this.idActividad = idActividad;
        this.calificacion = calificacion;
    }

    public IdActividad getIdActividad() {
        return idActividad;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
