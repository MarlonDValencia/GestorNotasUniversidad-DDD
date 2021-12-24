package com.universidad.informacionacademica.domain.asignatura;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.asignatura.values.*;

import java.util.Objects;

public class Docente extends Entity<IdDocente> {

    protected NombreDocente nombreDocente;
    protected AreaCurricular areaCurricular;
    protected Asignatura asignaturaAsignada;

    public Docente(IdDocente idDocente, NombreDocente nombreDocente, AreaCurricular areaCurricular){
        super(idDocente);
        this.nombreDocente = nombreDocente;
        this.areaCurricular = areaCurricular;
    }

    public void organizarProgramaDelCurso(Asignatura asignaturaAsignada){
        Objects.requireNonNull(this.asignaturaAsignada.programa, "El programa del curso no puede ser nulo");
    }

    public NombreDocente NombreDocente() {
        return nombreDocente;
    }

    public AreaCurricular AreaCurricular() {
        return areaCurricular;
    }

    public Asignatura AsignaturaAsignada() {
        return asignaturaAsignada;
    }
}
