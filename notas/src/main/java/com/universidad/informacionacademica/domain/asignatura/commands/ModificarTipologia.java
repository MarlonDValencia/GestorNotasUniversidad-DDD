package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Tipologia;

public class ModificarTipologia extends Command {
    private final Asignatura asignatura;
    private final Tipologia tipologia;

    public ModificarTipologia(Asignatura asignatura, Tipologia tipologia) {
        this.asignatura = asignatura;
        this.tipologia = tipologia;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }
}
