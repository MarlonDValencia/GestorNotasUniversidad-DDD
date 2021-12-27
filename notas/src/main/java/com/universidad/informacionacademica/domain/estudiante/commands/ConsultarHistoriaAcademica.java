package com.universidad.informacionacademica.domain.estudiante.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.values.PorcentajeDeAvance;

import java.util.HashMap;

public class ConsultarHistoriaAcademica extends Command {
    private final HashMap<Asignatura, Nota> materiasCursadas;
    private final PorcentajeDeAvance porcentajeDeAvance;
    private final Estudiante estudiante;

    public ConsultarHistoriaAcademica(HashMap<Asignatura, Nota> materiasCursadas, PorcentajeDeAvance porcentajeDeAvance, Estudiante estudiante) {
        this.materiasCursadas = materiasCursadas;
        this.porcentajeDeAvance = porcentajeDeAvance;
        this.estudiante = estudiante;
    }

    public HashMap<Asignatura, Nota> getMateriasCursadas() {
        return materiasCursadas;
    }

    public PorcentajeDeAvance getPorcentajeDeAvance() {
        return porcentajeDeAvance;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
