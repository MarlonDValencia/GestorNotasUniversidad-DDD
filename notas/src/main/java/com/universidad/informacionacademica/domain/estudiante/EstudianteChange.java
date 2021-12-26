package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.EventChange;
import com.universidad.informacionacademica.domain.estudiante.events.*;


public class EstudianteChange extends EventChange {
    public EstudianteChange(Estudiante estudiante){
        apply((EstudianteCreado event)->{
            estudiante.nombreEstudiante = event.getNombreEstudiante();
            estudiante.semestre = event.getSemestre();
            estudiante.asignaturasInscritas = event.getAsignaturasInscritas();
            estudiante.carrera = event.getCarrera();
            estudiante.pensum = event.getPensum();
            estudiante.historiaAcademica = event.getHistoriaAcademica();
        });

        apply((MateriaInscrita event) -> {
            estudiante.asignaturasInscritas.add(event.getAsignatura());
        });

        apply((MateriaCancelada event) -> {
            estudiante.asignaturasInscritas.removeIf(materia -> materia.identity().equals(event.getAsignatura().identity()));
        });

        apply((MateriaCursadaAgregada event) -> {
            estudiante.historiaAcademica.materiasCursadas().put(event.getMateriaCursada(),event.getNota());
        });

        apply((HistoriaAcademicaConsultada event) -> {
            estudiante.historiaAcademica.consultarHistoriaDelEstudiante();
        });
    }
}
