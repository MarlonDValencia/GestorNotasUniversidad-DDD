package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Creditos;

public class CreditosModificados extends DomainEvent {
    private final Creditos creditos;
    public CreditosModificados(Asignatura idAsignatura, Creditos creditos) {
        super("universidad.informacionacademica.asignaturacreada");
        this.creditos = creditos;
    }

    public Creditos getCreditos(){
        return creditos;
    }
}
