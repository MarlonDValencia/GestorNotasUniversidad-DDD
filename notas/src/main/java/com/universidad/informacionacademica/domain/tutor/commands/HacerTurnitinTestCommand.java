package com.universidad.informacionacademica.domain.tutor.commands;

import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;

public class HacerTurnitinTestCommand {
    private final CasoDeEstudio casoDeEstudio;

    public HacerTurnitinTestCommand(CasoDeEstudio casoDeEstudio) {
        this.casoDeEstudio = casoDeEstudio;
    }

    public CasoDeEstudio getCasoDeEstudio() {
        return casoDeEstudio;
    }
}
