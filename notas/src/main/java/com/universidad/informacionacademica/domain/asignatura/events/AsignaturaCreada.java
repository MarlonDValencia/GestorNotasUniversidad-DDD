package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.values.*;

public class AsignaturaCreada extends DomainEvent{
    private final NombreAsignatura nombreAsignatura;
    private final Creditos creditos;
    private final Tipologia tipologia;
    private final ProgramaDelCurso programaDelCurso;
    private final Nota nota;


    public AsignaturaCreada(NombreAsignatura nombreAsignatura, Creditos creditos, Tipologia tipologia, ProgramaDelCurso programaDelCurso, Nota nota) {
        super("universidad.informacionacademica.asignaturacreada");
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
        this.tipologia = tipologia;
        this.programaDelCurso = programaDelCurso;
        this.nota = nota;
    }

    public NombreAsignatura getNombreAsignatura() {
        return nombreAsignatura;
    }

    public Creditos getCreditos() {
        return creditos;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public ProgramaDelCurso getProgramaDelCurso() {
        return programaDelCurso;
    }

    public Nota getNota() {
        return nota;
    }
}
