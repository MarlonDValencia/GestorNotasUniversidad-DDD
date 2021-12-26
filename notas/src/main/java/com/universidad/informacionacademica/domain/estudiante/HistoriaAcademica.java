package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.values.IdHistoriaAcademica;
import com.universidad.informacionacademica.domain.estudiante.values.PorcentajeDeAvance;

import java.util.HashMap;

public class HistoriaAcademica extends Entity<IdHistoriaAcademica>{
    private final HashMap<Asignatura, Nota> materiasCursadas;
    private final PorcentajeDeAvance porcentajeDeAvance;

    public HistoriaAcademica(IdHistoriaAcademica entityId, HashMap<Asignatura, Nota> materiasCursadas, PorcentajeDeAvance porcentajeDeAvance) {
        super(entityId);
        this.materiasCursadas = materiasCursadas;
        this.porcentajeDeAvance = porcentajeDeAvance;
    }

    public void consultarHistoriaDelEstudiante(){
        this.materiasCursadas.forEach((k,v) -> System.out.println("Materia: " + k + ": Nota: " + v));
        System.out.println("El porcentaje de avance del estudiante es "+ this.porcentajeDeAvance);

    }

    public HashMap<Asignatura, Nota> materiasCursadas() {
        return materiasCursadas;
    }

    public PorcentajeDeAvance porcentajeDeAvance() {
        return porcentajeDeAvance;
    }
}
