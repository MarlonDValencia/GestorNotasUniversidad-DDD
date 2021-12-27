package com.universidad.informacionacademica.domain.tutor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;

public class TesisRecibida extends DomainEvent {
    protected EstudianteAsignado estudianteAsignado;
    protected TesisAsignada tesisAsignada;
    public TesisRecibida(EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada) {
        super("universidad.informacionacademica.tesisrecibida");
        this.tesisAsignada = tesisAsignada;
        this.estudianteAsignado = estudianteAsignado;
    }

    public EstudianteAsignado getEstudianteAsignado() {
        return estudianteAsignado;
    }

    public TesisAsignada getTesisAsignada() {
        return tesisAsignada;
    }
}
