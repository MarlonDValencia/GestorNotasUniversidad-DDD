package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FuenteDeInvestigacion implements ValueObject<String> {
    private final String value;

    public FuenteDeInvestigacion(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getFuenteDeInvestigacion(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
