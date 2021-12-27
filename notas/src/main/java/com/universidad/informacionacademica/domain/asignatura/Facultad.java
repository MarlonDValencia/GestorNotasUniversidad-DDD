package com.universidad.informacionacademica.domain.asignatura;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
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
    public void eliminarCarrera(IdCarrera idCarrera){
        Objects.requireNonNull(idCarrera, "El Id de la carrera ingresada no puede ser nulo");
        this.carreras.getCarreras().removeIf(item -> item.identity().equals(idCarrera));
    }

    public void abrirNuevaCarrera(Carrera carrera){
        Objects.requireNonNull(carrera, "El la carrera ingresada no puede ser nula");
        this.carreras.getCarreras().add(carrera);
    }

    public NombreFacultad nombreFacultad() {
        return nombreFacultad;
    }

    public Carreras carreras() {
        return carreras;
    }
}
