package com.universidad.informacionacademica.domain.estudiante.commands;

import com.universidad.informacionacademica.domain.asignatura.Asignatura;

public class InscribirMateria {
    private final Asignatura asignatura;

    public InscribirMateria(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }
}
