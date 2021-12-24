package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

public class AbrirCarrera extends Command {
    private final IdCarrera idCarrera;
    private final IdFacultad idFacultad;

    public AbrirCarrera(IdCarrera idCarrera, IdFacultad idFacultad) {
        this.idCarrera = idCarrera;
        this.idFacultad = idFacultad;
    }

    public IdCarrera getIdCarrera() {
        return idCarrera;
    }

    public IdFacultad getIdFacultad() {
        return idFacultad;
    }
}
