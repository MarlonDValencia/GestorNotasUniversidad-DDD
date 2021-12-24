package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Creditos;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Tipologia;

public class TipologiaModificada extends DomainEvent {
    private final Tipologia tipologia;
    public TipologiaModificada(Asignatura idAsignatura, Tipologia tipologia) {
        super("universidad.informacionacademica.tipologiamodificada");
        this.tipologia = tipologia;
    }

    public Tipologia getTipologia(){
        return tipologia;
    }
}
