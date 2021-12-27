package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.ProgramaDelCurso;

public class OrganizarProgramaCursoCommand extends Command {
    private final IdAsignatura idAsignatura;
    private final Docente docente;
    private final ProgramaDelCurso programa;

    public OrganizarProgramaCursoCommand(IdAsignatura idAsignatura, Docente docente, ProgramaDelCurso programa) {
        this.idAsignatura = idAsignatura;
        this.docente = docente;
        this.programa = programa;
    }

    public IdAsignatura getIdAsignatura() {
        return idAsignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public ProgramaDelCurso getPrograma() {
        return programa;
    }
}
