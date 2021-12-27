package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;

public class EliminarCarreraCommand extends Command {
    private final IdAsignatura idAsignatura;
    private final IdFacultad idFacultad;
    private final NombreFacultad nombreFacultad;
    private final Carrera carrera;

    public EliminarCarreraCommand(IdAsignatura idAsignatura, IdFacultad idFacultad, NombreFacultad nombreFacultad, Carrera carrera) {
        this.idAsignatura = idAsignatura;
        this.idFacultad = idFacultad;
        this.nombreFacultad = nombreFacultad;
        this.carrera = carrera;
    }

    public IdAsignatura getIdAsignatura() {
        return idAsignatura;
    }

    public IdFacultad getIdFacultad() {
        return idFacultad;
    }

    public NombreFacultad getNombreFacultad() {
        return nombreFacultad;
    }

    public Carrera getCarrera() {
        return carrera;
    }
}
