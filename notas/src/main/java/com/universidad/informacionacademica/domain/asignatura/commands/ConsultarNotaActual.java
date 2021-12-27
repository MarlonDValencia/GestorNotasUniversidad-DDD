package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;

public class ConsultarNotaActual extends Command {
    private final Asignatura asignatura;
    private final Nota nota;

    public ConsultarNotaActual(Asignatura asignatura) {
        this.asignatura = asignatura;
        this.nota = asignatura.nota();
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Nota getNota(){
        return nota;
    }
}
