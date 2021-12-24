package com.universidad.informacionacademica.domain.actividad.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.actividad.Clasificacion;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class ReplantearClasificacion extends Command {
    private final IdActividad idActividad;
    private final Clasificacion clasificacion;
    public ReplantearClasificacion(IdActividad idActividad, Clasificacion clasificacion) {
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
