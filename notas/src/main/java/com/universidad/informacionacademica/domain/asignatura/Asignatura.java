package com.universidad.informacionacademica.domain.asignatura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.events.*;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;

import java.util.List;

public class Asignatura extends AggregateEvent<IdAsignatura> {
    protected NombreAsignatura nombreAsignatura;
    protected Creditos creditos;
    protected Tipologia tipologia;
    protected ProgramaDelCurso programa;
    protected Nota nota;
    protected Docente docente;
    protected Facultad facultad;
    protected Departamento departamento;

    public Asignatura(IdAsignatura idAsignatura, NombreAsignatura nombreAsignatura, Creditos creditos, Tipologia tipologia, ProgramaDelCurso programa, Nota nota, Docente docente, Facultad facultad, Departamento departamento) {
        super(idAsignatura);
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
        this.tipologia = tipologia;
        this.programa = programa;
        this.nota = nota;
        this.docente = docente;
        this.facultad = facultad;
        this.departamento = departamento;
    }

    private Asignatura(IdAsignatura idAsignatura){
        super(idAsignatura);
        subscribe(new AsignaturaChange(this));
    }

    public static Asignatura from(IdAsignatura idAsignatura, List<DomainEvent> events){
        var asignatura = new Asignatura(idAsignatura);
        events.forEach(asignatura::applyEvent);
        return asignatura;
    }
    //Tenerla En Cuenta
    public void eliminarCarrera(IdCarrera idCarrera, IdFacultad idFacultad){
        appendChange(new CarreraEliminada(idCarrera,idFacultad)).apply();
    }
    //Tenerla En Cuenta
    public void abrirNuevaCarrera(IdAsignatura idAsignatura, Carrera carrera, IdFacultad idFacultad){
        appendChange(new CarreraAbierta(idAsignatura,carrera,idFacultad)).apply();
    }

    public void cambiarDocente(IdAsignatura idAsignatura, Docente docente, Docente newDocente){
        var id = docente.identity();
        appendChange(new DocenteCambiado(idAsignatura,id,newDocente)).apply();
    }

    public void consultarNotaActual(Asignatura asignatura){
        appendChange(new NotaActualConsultada(asignatura)).apply();
    }

    public void modificarCreditos(Asignatura asignatura, Creditos creditos){
        appendChange(new CreditosModificados(asignatura, creditos)).apply();
    }

    public void modificarTipologia(Asignatura asignatura, Tipologia tipologia){
        appendChange(new TipologiaModificada(asignatura, tipologia)).apply();
    }

    public void organizarProgramaCurso(IdAsignatura idAsignatura, Docente docente,ProgramaDelCurso programa){
        var id = docente.identity();
        appendChange(new ProgramaDelCursoOrganizado(idAsignatura,id,programa)).apply();
    }

    public NombreAsignatura nombreAsignatura() {
        return nombreAsignatura;
    }

    public Creditos creditos() {
        return creditos;
    }

    public Tipologia tipologia() {
        return tipologia;
    }

    public ProgramaDelCurso programa() {
        return programa;
    }

    public Nota nota() {
        return nota;
    }

    public Docente docente() {
        return docente;
    }

    public Facultad facultad() {
        return facultad;
    }

    public Departamento departamento() {
        return departamento;
    }
}
