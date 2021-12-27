package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Creditos;

public class ModificarCreditosCommand extends Command {
    private final Asignatura asignatura;
    private final Creditos creditos;

    public ModificarCreditosCommand(Asignatura asignatura, Creditos creditos) {
        this.asignatura = asignatura;
        this.creditos = creditos;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Creditos getCreditos() {
        return creditos;
    }
}
