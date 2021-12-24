package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.*;

public class NotaActualConsultada extends DomainEvent {
    private final Nota nota;
    public NotaActualConsultada(Asignatura asignatura) {
        super("universidad.informacionacademica.docentecambiado");
        this.nota = asignatura.nota();
    }

    public Nota getNota(){
        return getNota();
    }
}
