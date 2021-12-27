package com.universidad.informacionacademica.domain.tutor;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.tutor.values.EstadoTesis;
import com.universidad.informacionacademica.domain.tutor.values.IdTesisAsignada;
import com.universidad.informacionacademica.domain.tutor.values.TemaTesis;

public class TesisAsignada extends Entity<IdTesisAsignada>{
    private final TemaTesis temaTesis;
    private EstadoTesis estadoTesis;

    public TesisAsignada(IdTesisAsignada idTesisAsignada, TemaTesis temaTesis, EstadoTesis estadoTesis) {
        super(idTesisAsignada);
        this.temaTesis = temaTesis;
        this.estadoTesis = estadoTesis;
    }

    public void calificarTesis(EstadoTesis estadoTesis){
        this.estadoTesis = new EstadoTesis("Calificada");
    }


    public TemaTesis temaTesis() {
        return temaTesis;
    }

    public EstadoTesis estadoTesis() {
        return estadoTesis;
    }
}
