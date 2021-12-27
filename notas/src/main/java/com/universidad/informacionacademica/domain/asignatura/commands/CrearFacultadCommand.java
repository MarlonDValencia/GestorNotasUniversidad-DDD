package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.values.Carreras;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.asignatura.values.NombreFacultad;

public class CrearFacultadCommand extends Command {
    private final IdFacultad idFacultad;
    private final NombreFacultad nombreFacultad;
    private final Carreras carreras;

    public CrearFacultadCommand(IdFacultad idFacultad, NombreFacultad nombreFacultad, Carreras carreras) {
        this.idFacultad = idFacultad;
        this.nombreFacultad = nombreFacultad;
        this.carreras = carreras;
    }

    public IdFacultad getIdFacultad() {
        return idFacultad;
    }

    public NombreFacultad getNombreFacultad() {
        return nombreFacultad;
    }

    public Carreras getCarreras() {
        return carreras;
    }
}
