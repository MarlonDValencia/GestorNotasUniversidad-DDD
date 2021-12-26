package com.universidad.informacionacademica.domain.estudiante.commands;

import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.values.PorcentajeDeAvance;

import java.util.HashMap;

public class ConsultarHistoriaAcademica {
    private final HashMap<Asignatura, Nota> materiasCursadas;
    private final PorcentajeDeAvance porcentajeDeAvance;

    public ConsultarHistoriaAcademica(HashMap<Asignatura, Nota> materiasCursadas, PorcentajeDeAvance porcentajeDeAvance) {
        this.materiasCursadas = materiasCursadas;
        this.porcentajeDeAvance = porcentajeDeAvance;
    }

    public HashMap<Asignatura, Nota> getMateriasCursadas() {
        return materiasCursadas;
    }

    public PorcentajeDeAvance getPorcentajeDeAvance() {
        return porcentajeDeAvance;
    }
}
