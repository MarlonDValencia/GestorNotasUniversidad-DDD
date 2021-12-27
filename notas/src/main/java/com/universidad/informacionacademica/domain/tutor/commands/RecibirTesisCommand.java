package com.universidad.informacionacademica.domain.tutor.commands;

import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;

public class RecibirTesisCommand {

    private final EstudianteAsignado estudianteAsignado;
    private final TesisAsignada tesisAsignada;

    public RecibirTesisCommand(EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada) {
        this.estudianteAsignado = estudianteAsignado;
        this.tesisAsignada = tesisAsignada;
    }

    public EstudianteAsignado getEstudianteAsignado() {
        return estudianteAsignado;
    }

    public TesisAsignada getTesisAsignada() {
        return tesisAsignada;
    }
}
