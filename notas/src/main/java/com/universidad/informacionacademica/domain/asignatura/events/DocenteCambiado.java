package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdDocente;

public class DocenteCambiado extends DomainEvent {
    private final Docente newDocente;
    public DocenteCambiado(IdAsignatura idAsignatura, IdDocente id, Docente newDocente) {
        super("universidad.informacionacademica.docentecambiado");
        this.newDocente = newDocente;
    }

    public Docente getNewDocente(){
        return newDocente;
    }
}
