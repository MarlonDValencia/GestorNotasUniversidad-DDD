package com.universidad.informacionacademica.domain.tutor;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.tutor.values.CarreraEstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.values.EstadoTesis;
import com.universidad.informacionacademica.domain.tutor.values.IdEstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.values.NombreEstudianteAsignado;

import java.util.Objects;

public class EstudianteAsignado extends Entity<IdEstudianteAsignado> {
    private final NombreEstudianteAsignado nombreEstudianteAsignado;
    private final CarreraEstudianteAsignado carreraEstudianteAsignado;
    private EstadoTesis estadoTesis;

    public EstudianteAsignado(IdEstudianteAsignado idEstudianteAsignado, NombreEstudianteAsignado nombreEstudianteAsignado, CarreraEstudianteAsignado carreraEstudianteAsignado, EstadoTesis estadoTesis){
        super(idEstudianteAsignado);
        this.nombreEstudianteAsignado = nombreEstudianteAsignado;
        this.carreraEstudianteAsignado = carreraEstudianteAsignado;
        this.estadoTesis = estadoTesis;
    }

    public void recibirTesis(){
        this.estadoTesis = new EstadoTesis("Recibida");
    }

    public NombreEstudianteAsignado nombreEstudianteAsignado() {
        return nombreEstudianteAsignado;
    }

    public CarreraEstudianteAsignado carreraEstudianteAsignado() {
        return carreraEstudianteAsignado;
    }

    public EstadoTesis estadoTesis() {
        return estadoTesis;
    }
}
