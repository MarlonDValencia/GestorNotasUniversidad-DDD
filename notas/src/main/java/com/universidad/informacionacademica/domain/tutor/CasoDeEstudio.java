package com.universidad.informacionacademica.domain.tutor;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.tutor.values.EstadoDeAprobacion;
import com.universidad.informacionacademica.domain.tutor.values.FuenteDeInvestigacion;
import com.universidad.informacionacademica.domain.tutor.values.IdCasoDeEstudio;

public class CasoDeEstudio extends Entity<IdCasoDeEstudio>{
    private final FuenteDeInvestigacion fuenteDeInvestigacion;
    private EstadoDeAprobacion estadoDeAprobacion;

    public CasoDeEstudio(IdCasoDeEstudio idCasoDeEstudio, FuenteDeInvestigacion fuenteDeInvestigacion, EstadoDeAprobacion estadoDeAprobacion){
        super(idCasoDeEstudio);
        this.fuenteDeInvestigacion = fuenteDeInvestigacion;
        this.estadoDeAprobacion = estadoDeAprobacion;
    }

    public void hacerTurnitinTest(){
        this.estadoDeAprobacion = new EstadoDeAprobacion("Approbed");
    }

    public FuenteDeInvestigacion fuenteDeInvestigacion() {
        return fuenteDeInvestigacion;
    }

    public EstadoDeAprobacion estadoDeAprobacion() {
        return estadoDeAprobacion;
    }
}
