package com.universidad.informacionacademica.domain.estudiante.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.values.IdEstudiante;

public class AgregarMateriaCursadaCommand extends Command {
    private final IdEstudiante idEstudiante;
    private final Asignatura materiaCursada;
    private final Nota nota;

    public AgregarMateriaCursadaCommand(Asignatura materiaCursada, IdEstudiante idEstudiante, Nota nota) {
        this.idEstudiante = idEstudiante;
        this.materiaCursada = materiaCursada;
        this.nota = nota;
    }

    public Asignatura getMateriaCursada() {
        return materiaCursada;
    }

    public IdEstudiante getIdEstudiante() {
        return idEstudiante;
    }

    public Nota getNota() {
        return nota;
    }
}
