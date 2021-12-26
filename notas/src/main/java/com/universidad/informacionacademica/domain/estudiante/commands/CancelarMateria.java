package com.universidad.informacionacademica.domain.estudiante.commands;

import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;

public class CancelarMateria {
    private final Asignatura asignatura;
    private final Estudiante estudiante;

    public CancelarMateria(Asignatura asignatura, Estudiante estudiante) {
        this.asignatura = asignatura;
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
