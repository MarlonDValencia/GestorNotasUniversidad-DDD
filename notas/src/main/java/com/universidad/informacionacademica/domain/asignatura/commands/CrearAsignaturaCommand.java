package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.values.*;

public class CrearAsignaturaCommand extends Command {
    private final IdAsignatura idAsignatura;
    private final NombreAsignatura nombreAsignatura;
    private final Creditos creditos;
    private final Tipologia tipologia;
    private final ProgramaDelCurso programaDelCurso;
    private final Nota nota;
    private final Docente docente;
    private final Facultad facultad;
    private final Departamento departamento;

    public CrearAsignaturaCommand(IdAsignatura idAsignatura, NombreAsignatura nombreAsignatura, Creditos creditos, Tipologia tipologia, ProgramaDelCurso programaDelCurso, Nota nota, Docente docente, Facultad facultad, Departamento departamento) {
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
        this.tipologia = tipologia;
        this.programaDelCurso = programaDelCurso;
        this.nota = nota;
        this.docente = docente;
        this.facultad = facultad;
        this.departamento = departamento;
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

    public Docente getDocente() {
        return docente;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public IdAsignatura getIdAsignatura() {
        return idAsignatura;
    }
}
