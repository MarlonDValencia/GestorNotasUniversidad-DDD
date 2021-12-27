package com.universidad.informacionacademica.domain.tutor.values;

import co.com.sofka.domain.generic.Identity;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

public class IdCasoDeEstudio extends Identity {
    public IdCasoDeEstudio(String value) {
        super(value);
    }

    public IdCasoDeEstudio() {
    }

    public static IdCasoDeEstudio of(String value) {
        return new IdCasoDeEstudio(value);
    }
}
