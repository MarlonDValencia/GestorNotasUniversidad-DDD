package com.universidad.informacionacademica.domain.actividad;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.values.Estado;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;
import com.universidad.informacionacademica.domain.actividad.values.Nombre;
import com.universidad.informacionacademica.domain.actividad.values.Porcentaje;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;

import java.util.List;

public class ActividadAcademica extends AggregateEvent<IdActividad> {
    protected Nombre nombre;
    protected Porcentaje porcentaje;
    protected Estado estado;
    protected Clasificacion clasificacion;
    protected Calificacion calificacion;
    protected FechaLimite fechaLimite;

    public ActividadAcademica(IdActividad idActividad, Nombre nombre, Porcentaje porcentaje, Estado estado, Clasificacion clasificacion, Calificacion calificacion, FechaLimite fechaLimite) {
        super(idActividad);
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.estado = estado;
        this.clasificacion = clasificacion;
        this.calificacion = calificacion;
        this.fechaLimite = fechaLimite;
    }

    private ActividadAcademica(IdActividad idActividad){
        super(idActividad);
        subscribe(new ActividadAcademicaChange(this));
    }

    public static ActividadAcademica from(IdActividad idActividad, List<DomainEvent> events){
        var actividadAcademica = new ActividadAcademica(idActividad);
        events.forEach(actividadAcademica::applyEvent);
        return actividadAcademica;
    }


}
