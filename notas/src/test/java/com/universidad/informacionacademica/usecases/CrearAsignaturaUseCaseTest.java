package com.universidad.informacionacademica.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.commands.CrearAsignaturaCommand;
import com.universidad.informacionacademica.domain.asignatura.events.AsignaturaCreada;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.usecase.CrearAsignaturaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CrearAsignaturaUseCaseTest {
    @Test
    void CrearAsignatura(){
        //arrange
        Map<String, String> map = new HashMap<String, String>();
        Set<Carrera> set = new HashSet<Carrera>();
        Set<String> set2 = new HashSet<String>();
        Docente docente = new Docente(
                IdDocente.of("YYYYYYYYY"),
                new NombreDocente("Alberto"),
                new AreaCurricular("Ciencias de la ingenieria")
        );
        Facultad facultad = new Facultad(
                IdFacultad.of("XXXXXXXX"),
                new NombreFacultad("Facultad De Ciencias"),
                new Carreras(set)
        );
        Departamento departamento = new Departamento(
                IdDepartamento.of("XXXXXXXX"),
                new Miembros(set2),
                new AreaEncargada("Fisica")
        );
        Asignatura asignatura = new Asignatura(
                IdAsignatura.of("XXXXXXXX"),
                new NombreAsignatura("Mecanica De Fluidos"),
                new Creditos(4),
                new Tipologia("Obligatoria"),
                new ProgramaDelCurso(map),
                new Nota(4.2),
                docente,
                facultad,
                departamento
        );
        var command = new CrearAsignaturaCommand(
                IdAsignatura.of("XXXXXXXX"),
                new NombreAsignatura("Mecanica De Fluidos"),
                new Creditos(4),
                new Tipologia("Obligatoria"),
                new ProgramaDelCurso(map),
                new Nota(4.2),
                docente,
                facultad,
                departamento);
        var useCase = new CrearAsignaturaUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        //asserts
        AsignaturaCreada event = (AsignaturaCreada)events.getDomainEvents().get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
    }
}
