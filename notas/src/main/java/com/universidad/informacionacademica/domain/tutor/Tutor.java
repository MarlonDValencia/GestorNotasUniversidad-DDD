package com.universidad.informacionacademica.domain.tutor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.events.*;
import com.universidad.informacionacademica.domain.tutor.values.IdTutor;
import com.universidad.informacionacademica.domain.tutor.values.NombreTutor;

import java.util.List;

public class Tutor extends AggregateEvent<IdTutor> {
    protected NombreTutor nombreTutor;
    protected EstudianteAsignado estudianteAsignado;
    protected TesisAsignada tesisAsignada;
    protected CasoDeEstudio casoDeEstudio;

    public Tutor(IdTutor idTutor, NombreTutor nombreTutor, EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada, CasoDeEstudio casoDeEstudio) {
        super(idTutor);
        subscribe(new TutorChange(this));
        appendChange(new TutorCreado(idTutor,nombreTutor,estudianteAsignado,tesisAsignada,casoDeEstudio)).apply();
    }
    private Tutor(IdTutor idTutor){
        super(idTutor);
        subscribe(new TutorChange(this));
    }

    public static Tutor from(IdTutor idTutor, List<DomainEvent> events){
        var tutor = new Tutor((idTutor));
        events.forEach(tutor::applyEvent);
        return tutor;
    }

    public void desvincularUnEstudianteAsignado(EstudianteAsignado estudianteAsignado){
        appendChange(new EstudianteDesvinculado(estudianteAsignado)).apply();
    }

    public void recibirUnaTesis(EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada){
        appendChange(new TesisRecibida(estudianteAsignado,tesisAsignada)).apply();
    }

    public void calificarUnaTesis(TesisAsignada tesisAsignada){
        appendChange(new TesisCalificada(tesisAsignada)).apply();
    }

    public void hacerTurnitinTestAUnCasoDeEstudio(CasoDeEstudio casoDeEstudio){
        appendChange(new TurnitinTestHecho(casoDeEstudio)).apply();
    }

    public NombreTutor nombreTutor() {
        return nombreTutor;
    }

    public EstudianteAsignado estudianteAsignado() {
        return estudianteAsignado;
    }

    public TesisAsignada tesisAsignada() {
        return tesisAsignada;
    }

    public CasoDeEstudio casoDeEstudio() {
        return casoDeEstudio;
    }
}
