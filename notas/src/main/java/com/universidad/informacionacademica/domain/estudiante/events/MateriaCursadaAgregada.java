package com.universidad.informacionacademica.domain.estudiante.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;

public class MateriaCursadaAgregada extends DomainEvent {
    private final Asignatura materiaCursada;
    private final Nota nota;
    public MateriaCursadaAgregada(Asignatura asignatura,Nota nota){
        super("universidad.informacionacademica.materiacursadaagregada");
        this.materiaCursada = asignatura;
        this.nota = nota;
    }

    public Asignatura getMateriaCursada() {
        return materiaCursada;
    }

    public Nota getNota() {
        return nota;
    }
}
