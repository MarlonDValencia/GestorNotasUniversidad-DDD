package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaLimite implements ValueObject<Date> {
    protected Date fechaLimite;

    public FechaLimite(Date fechaLimite){
        this.fechaLimite = Objects.requireNonNull(fechaLimite);
    }

    public void alrgarPlazo(Date fechaLimite) throws Exception {
        if(this.fechaLimite.after(fechaLimite)){
            throw new Exception("Para aplazar el plazo la fecha limite debe ser posterior a la ya establecida en la actividad");
        }this.fechaLimite = fechaLimite;
    }

    public Date getFechaLimite(){
        return fechaLimite;
    }

    @Override
    public Date value(){
        return fechaLimite;
    }

}
