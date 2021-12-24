package com.universidad.informacionacademica.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.Clasificacion;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class ClasificacionReplanteada extends DomainEvent {
    public ClasificacionReplanteada(IdActividad idActividad, Clasificacion clasificacion) {
        super("");
    }
}
