package com.universidad.informacionacademica.domain.tutor;

import co.com.sofka.domain.generic.EventChange;
import com.universidad.informacionacademica.domain.tutor.events.*;
import com.universidad.informacionacademica.domain.tutor.values.EstadoTesis;

public class TutorChange extends EventChange {
    public TutorChange(Tutor tutor) {
        apply((TutorCreado event) -> {
            tutor.nombreTutor = event.getNombreTutor();
            tutor.estudianteAsignado = event.getEstudianteAsignado();
            tutor.tesisAsignada = event.getTesisAsignada();
            tutor.casoDeEstudio = event.getCasoDeEstudio();
        });

        apply((EstudianteDesvinculado event) -> {
            tutor.estudianteAsignado = new EstudianteAsignado(null,null,null,null);
        });

        apply((TesisRecibida event) -> {
            tutor.estudianteAsignado.recibirTesis();
        });

        apply((TesisCalificada event) -> {
            tutor.tesisAsignada.calificarTesis(tutor.estudianteAsignado.estadoTesis());
        });

        apply(((TurnitinTestHecho event) -> {
            tutor.casoDeEstudio.hacerTurnitinTest();
        }));
    }
}
