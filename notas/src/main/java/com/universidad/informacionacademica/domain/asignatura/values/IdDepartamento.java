package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.Identity;

public class IdDepartamento extends Identity {
    public IdDepartamento(String value){
        super(value);
    }

    public IdDepartamento(){
    }

    public static IdDepartamento of (String value){
        return new IdDepartamento(value);
    }
}
