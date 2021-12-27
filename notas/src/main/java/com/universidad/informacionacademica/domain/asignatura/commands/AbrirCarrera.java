package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

public class AbrirCarrera extends Command {
    private final IdAsignatura idAsignatura;
    private final Carrera carrera;
    private final IdFacultad idFacultad;

    public AbrirCarrera(Carrera carrera, IdFacultad idFacultad,IdAsignatura idAsignatura) {
        this.carrera = carrera;
        this.idFacultad = idFacultad;
        this.idAsignatura = idAsignatura;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public IdFacultad getIdFacultad() {
        return idFacultad;
    }

    public IdAsignatura getIdAsignatura() {
        return idAsignatura;
    }
}
