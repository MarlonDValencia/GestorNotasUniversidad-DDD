package com.universidad.informacionacademica.domain.tutor.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;

public class CalificarTesisCommand extends Command {
    private final TesisAsignada tesisAsignada;

    public CalificarTesisCommand(TesisAsignada tesisAsignada) {
        this.tesisAsignada = tesisAsignada;
    }

    public TesisAsignada getTesisAsignada() {
        return tesisAsignada;
    }
}
