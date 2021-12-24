package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.Identity;

public class IdDocente extends Identity {
    public IdDocente(String value){
        super(value);
    }

    public IdDocente(){
    }

    public static IdDocente of (String value){
        return new IdDocente(value);
    }

}
