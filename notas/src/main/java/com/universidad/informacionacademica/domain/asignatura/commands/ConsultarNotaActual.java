package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;

public class ConsultarNotaActual extends Command {
    private final Asignatura asignatura;

    public ConsultarNotaActual(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }
}
