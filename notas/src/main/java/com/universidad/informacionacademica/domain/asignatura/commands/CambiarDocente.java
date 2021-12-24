package com.universidad.informacionacademica.domain.asignatura.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;

public class CambiarDocente extends Command {
    private final IdAsignatura idAsignatura;
    private final Docente docente;
    private final Docente newDocente;

    public CambiarDocente(IdAsignatura idAsignatura, Docente docente, Docente newDocente) {
        this.idAsignatura = idAsignatura;
        this.docente = docente;
        this.newDocente = newDocente;
    }

    public IdAsignatura getIdAsignatura() {
        return idAsignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public Docente getNewDocente() {
        return newDocente;
    }
}
