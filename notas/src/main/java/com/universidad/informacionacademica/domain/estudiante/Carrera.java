package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import com.universidad.informacionacademica.domain.estudiante.values.*;

public class Carrera extends AggregateEvent<IdCarrera> {
    private final NombreCarrera nombreCarrera;
    private final NumeroDeCreditos numeroDeCreditos;
    private EstadoSemestre estadoSemestre;

    public Carrera(IdCarrera idCarrera, NombreCarrera nombreCarrera, NumeroDeCreditos numeroDeCreditos, EstadoSemestre estadoSemestre) {
        super(idCarrera);
        this.nombreCarrera = nombreCarrera;
        this.numeroDeCreditos = numeroDeCreditos;
        this.estadoSemestre = estadoSemestre;
    }

    public void matricularSemestre(EstadoSemestre estadoSemestre){
        this.estadoSemestre = estadoSemestre;
    }
    public NombreCarrera nombreCarrera() {
        return nombreCarrera;
    }

    public NumeroDeCreditos numeroDeCreditos() {
        return numeroDeCreditos;
    }

    public EstadoSemestre estadoSemestre() {
        return estadoSemestre;
    }

}
