package com.universidad.informacionacademica.domain.asignatura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Map;

public class ProgramaDelCurso implements ValueObject<Map<String,String>> {
    private final Map<String,String> programa;

    public ProgramaDelCurso(Map<String, String> programa) {
        this.programa = programa;
    }


    public Map<String, String> getPrograma() {
        return programa;
    }

    @Override
    public Map<String, String> value() {
        return programa;
    }
}
