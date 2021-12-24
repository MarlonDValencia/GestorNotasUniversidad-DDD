package com.universidad.informacionacademica.domain.asignatura;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.asignatura.events.CarreraEliminada;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

import java.util.Objects;

public class Facultad extends Entity<IdFacultad> {

    protected NombreFacultad nombreFacultad;
    protected Carreras carreras;

    public Facultad(IdFacultad idFacultad, NombreFacultad nombreFacultad, Carreras carreras) {
        super(idFacultad);
        this.nombreFacultad = nombreFacultad;
        this.carreras = carreras;
    }
    public void eliminarCarrera(IdCarrera idCarrera, IdFacultad idFacultad){

        Objects.requireNonNull(idCarrera);
    }

    public void abrirNuevaCarrera(IdCarrera idCarrera, IdFacultad idFacultad){
        Objects.requireNonNull(idCarrera);
    }


}
