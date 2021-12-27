package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.Identity;

public class IdAsignatura extends Identity {
    public IdAsignatura(String value){
        super(value);
    }

    public IdAsignatura(){
    }

    public static IdAsignatura of (String value){
        return new IdAsignatura(value);
    }

}
