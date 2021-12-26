package com.universidad.informacionacademica.domain.estudiante.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;

public class AgregarMateriaCursada extends Command {
    private final Asignatura materiaCursada;

    public AgregarMateriaCursada(Asignatura materiaCursada) {
        this.materiaCursada = materiaCursada;
    }

    public Asignatura getMateriaCursada() {
        return materiaCursada;
    }
}
