package com.universidad.informacionacademica.domain.asignatura;

import co.com.sofka.domain.generic.EventChange;
import com.universidad.informacionacademica.domain.asignatura.events.*;

import java.util.function.Consumer;

public class AsignaturaChange extends EventChange {
    public AsignaturaChange(Asignatura asignatura) {
        apply((AsignaturaCreada event) -> {
            asignatura.nombreAsignatura = event.getNombreAsignatura();
            asignatura.creditos = event.getCreditos();
            asignatura.tipologia = event.getTipologia();
            asignatura.programa = event.getProgramaDelCurso();
            asignatura.nota = event.getNota();
            asignatura.facultad = event.getFacultad();
            asignatura.docente = event.getDocente();
            asignatura.departamento = event.getDepartamento();

        });

        apply((CarreraEliminada event) -> {

        });

        apply((DocenteCambiado event) -> {
            asignatura.docente = event.getNewDocente();
        });

        apply((Consumer<NotaActualConsultada>) NotaActualConsultada::getNota);

        apply((CreditosModificados event) -> {
            asignatura.creditos = event.getCreditos();
        });

        apply((TipologiaModificada event) -> {
            asignatura.tipologia = event.getTipologia();
        });

        apply((ProgramaDelCursoOrganizado event) -> {
            asignatura.programa =  event.getProgramaDelCurso();
        });

        apply((FacultadCreada event) -> {
            asignatura.facultad = new Facultad(event.getIdFacultad(),event.getNombreFacultad(),event.getCarreras());
        });
    }
}
