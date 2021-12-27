package com.universidad.informacionacademica.domain.estudiante.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;

public class InscribirMateriaCommand extends Command {
    private final Asignatura asignatura;
    private final Estudiante estudiante;

    public InscribirMateriaCommand(Asignatura asignatura, Estudiante estudiante) {
        this.asignatura = asignatura;
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
