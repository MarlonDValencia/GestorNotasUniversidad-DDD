package com.universidad.informacionacademica.domain.tutor.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;

public class DesvincularEstudianteAsignadoCommand  extends Command {
    private final EstudianteAsignado estudianteAsignado;

    public DesvincularEstudianteAsignadoCommand(EstudianteAsignado estudianteAsignado) {
        this.estudianteAsignado = estudianteAsignado;
    }

    public EstudianteAsignado getEstudianteAsignado() {
        return estudianteAsignado;
    }
}
