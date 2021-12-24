package com.universidad.informacionacademica.domain.actividad.values;

import co.com.sofka.domain.generic.Identity;

public class IdActividad extends Identity {
    public IdActividad(String value){
        super(value);
    }

    public IdActividad(){

    }

    public IdActividad of (String value){
        return new IdActividad(value);
    }
}
