package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;
import com.universidad.informacionacademica.domain.tutor.values.IdTutor;
import com.universidad.informacionacademica.domain.tutor.values.NombreTutor;

public class TutorCreado extends DomainEvent {
    protected NombreTutor nombreTutor;
    protected EstudianteAsignado estudianteAsignado;
    protected TesisAsignada tesisAsignada;
    protected CasoDeEstudio casoDeEstudio;
    public TutorCreado(IdTutor idTutor, NombreTutor nombreTutor, EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada, CasoDeEstudio casoDeEstudio) {
        super("universidad.informacionacademica.tutorcreado");
        this.nombreTutor = nombreTutor;
        this.estudianteAsignado = estudianteAsignado;
        this.tesisAsignada = tesisAsignada;
        this.casoDeEstudio = casoDeEstudio;
    }

    public NombreTutor getNombreTutor() {
        return nombreTutor;
    }

    public EstudianteAsignado getEstudianteAsignado() {
        return estudianteAsignado;
    }

    public TesisAsignada getTesisAsignada() {
        return tesisAsignada;
    }

    public CasoDeEstudio getCasoDeEstudio() {
        return casoDeEstudio;
    }
}
