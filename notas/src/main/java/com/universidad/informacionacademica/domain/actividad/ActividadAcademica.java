package com.universidad.informacionacademica.domain.actividad;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.actividad.events.CalificacionEditada;
import com.universidad.informacionacademica.domain.actividad.events.ClasificacionReplanteada;
import com.universidad.informacionacademica.domain.actividad.events.PlazoAlargado;
import com.universidad.informacionacademica.domain.actividad.values.Estado;
import com.universidad.informacionacademica.domain.actividad.values.IdActividad;
import com.universidad.informacionacademica.domain.actividad.values.NombreActividad;
import com.universidad.informacionacademica.domain.actividad.values.Porcentaje;

import java.util.List;

public class ActividadAcademica extends AggregateEvent<IdActividad> {
    protected NombreActividad nombreActividad;
    protected Porcentaje porcentaje;
    protected Estado estado;
    protected Clasificacion clasificacion;
    protected Calificacion calificacion;
    protected FechaLimite fechaLimite;

    public ActividadAcademica(IdActividad idActividad, NombreActividad nombreActividad, Porcentaje porcentaje, Estado estado, Clasificacion clasificacion, Calificacion calificacion, FechaLimite fechaLimite) {
        super(idActividad);
        this.nombreActividad = nombreActividad;
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

    public void replantearClasificacion(IdActividad idActividad, Clasificacion clasificacion){
        appendChange(new ClasificacionReplanteada(idActividad, clasificacion)).apply();
    }

    public void editarCalificacionDeLaActividad(IdActividad idActividad, Calificacion calificacion){
        appendChange(new CalificacionEditada(idActividad, calificacion)).apply();
    }

    public void alargarElPlazoDeLaActividad(IdActividad idActividad,FechaLimite fechaLimite){
        appendChange(new PlazoAlargado(idActividad,fechaLimite)).apply();
    }
}
