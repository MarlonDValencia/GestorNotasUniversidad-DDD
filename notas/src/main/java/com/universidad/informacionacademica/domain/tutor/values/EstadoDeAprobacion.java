package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoDeAprobacion implements ValueObject<String> {
    private final String value;

    public EstadoDeAprobacion(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getEstadoDeAprobacion(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
