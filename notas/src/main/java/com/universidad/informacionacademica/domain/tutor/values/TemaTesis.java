package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TemaTesis implements ValueObject<String> {
    private final String value;

    public TemaTesis(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public String getTemaTesis(){
        return this.value;
    }

    @Override
    public String value() {
        return value;
    }
}
