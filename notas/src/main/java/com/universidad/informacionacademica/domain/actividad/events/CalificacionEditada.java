package com.universidad.informacionacademica.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.Calificacion;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class CalificacionEditada extends DomainEvent {
    public CalificacionEditada(IdActividad idActividad, Calificacion calificacion) {
        super("");
    }
}
