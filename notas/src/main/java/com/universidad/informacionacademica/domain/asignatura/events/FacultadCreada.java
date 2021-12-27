package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.values.Carreras;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.asignatura.values.NombreFacultad;

public class FacultadCreada extends DomainEvent {
    private final IdFacultad idFacultad;
    private final NombreFacultad nombreFacultad;
    private final Carreras carreras;

    public FacultadCreada(IdFacultad idFacultad, NombreFacultad nombreFacultad, Carreras carreras) {
        super("universidad.informacionacademica.facultadcreada");

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
