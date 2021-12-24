package com.universidad.informacionacademica.domain.actividad.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.actividad.Calificacion;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class EditarCalificacion extends Command {
    private final IdActividad idActividad;
    private final Calificacion calificacion;
    public EditarCalificacion(IdActividad idActividad, Calificacion calificacion) {
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
