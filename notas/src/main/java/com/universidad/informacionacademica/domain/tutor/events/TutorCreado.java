package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;
import com.universidad.informacionacademica.domain.tutor.values.IdTutor;
import com.universidad.informacionacademica.domain.tutor.values.NombreTutor;

import java.util.UUID;

public class TutorCreado extends DomainEvent {
    public TutorCreado(IdTutor idTutor, NombreTutor nombreTutor, EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada, CasoDeEstudio casoDeEstudio) {
        super("");
    }
}
