package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import com.universidad.informacionacademica.domain.estudiante.values.*;

public class Carrera extends AggregateEvent<IdCarrera> {
    private final NombreCarrera nombreCarrera;
    private final NumeroDeCreditos numeroDeCreditos;
    private EstadoSemestre estadoSemestre;
    private final PromedioAcumulado promedioAcumulado;

    public Carrera(IdCarrera idCarrera, NombreCarrera nombreCarrera, NumeroDeCreditos numeroDeCreditos, EstadoSemestre estadoSemestre, PromedioAcumulado promedioAcumulado) {
        super(idCarrera);
        this.nombreCarrera = nombreCarrera;
        this.numeroDeCreditos = numeroDeCreditos;
        this.estadoSemestre = estadoSemestre;
        this.promedioAcumulado = promedioAcumulado;
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

    public PromedioAcumulado promedioAcumulado() {
        return promedioAcumulado;
    }
}
