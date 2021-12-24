package com.universidad.informacionacademica.domain.actividad.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.actividad.FechaLimite;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;

public class AlargarPlazoActividad extends Command {
    private final IdActividad idActividad;
    private final FechaLimite fechaLimiteLimite;

    public AlargarPlazoActividad(IdActividad idActividad, FechaLimite fechaLimiteLimite) {
        this.idActividad = idActividad;
        this.fechaLimiteLimite = fechaLimiteLimite;
    }

    public IdActividad getIdActividad() {
        return idActividad;
    }

    public FechaLimite getFechaLimiteLimite() {
        return fechaLimiteLimite;
    }
}
