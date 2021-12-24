package com.universidad.informacionacademica.domain.asignatura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdDocente;
import com.universidad.informacionacademica.domain.asignatura.values.ProgramaDelCurso;

public class ProgramaDelCursoOrganizado extends DomainEvent {
    private final ProgramaDelCurso programaDelCurso;
    public ProgramaDelCursoOrganizado(IdAsignatura idAsignatura, IdDocente id, ProgramaDelCurso programaDelCurso) {
        super("universidad.informacionacademica.programadelcursoorganizado");
        this.programaDelCurso = programaDelCurso;
    }

    public ProgramaDelCurso getProgramaDelCurso(){
        return programaDelCurso;
    }

}
