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
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.HistoriaAcademica;
import com.universidad.informacionacademica.domain.estudiante.Pensum;
import com.universidad.informacionacademica.domain.estudiante.commands.CrearEstudianteCommand;
import com.universidad.informacionacademica.domain.estudiante.events.EstudianteCreado;
import com.universidad.informacionacademica.domain.estudiante.values.*;
import com.universidad.informacionacademica.usecase.CrearEstudianteUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CrearEstudianteUseCaseTest {
    @Test
    void CrearEstudiante() {
        //arrange
        HashMap<Asignatura, Nota> map2 = new HashMap<Asignatura, Nota>();
        Set<Asignatura> set3 = new HashSet<Asignatura>();
        IdCarrera idCarrera = IdCarrera.of("YYYYYYY");
        NombreCarrera nombreCarrera = new NombreCarrera("Ingeniería Electrica");
        NumeroDeCreditos numeroDeCreditos = new NumeroDeCreditos(3);
        EstadoSemestre estadoSemestre = new EstadoSemestre("Matriculado");
        Carrera carrera = new Carrera(idCarrera, nombreCarrera, numeroDeCreditos, estadoSemestre);
        HistoriaAcademica historia = new HistoriaAcademica(IdHistoriaAcademica.of("TTTTTTTT"), map2, new PorcentajeDeAvance(27.3));


        var command = new CrearEstudianteCommand(
                IdEstudiante.of("ZZZZZZZZ"),
                new NombreEstudiante("Andres Vargas"),
                new Semestre(5),
                set3,
                carrera,
                new Pensum(new IdPensum("KKKKKKKKK"),new MateriasObligatorias(set3), new MateriasOptativas(set3)),
                historia
        );
        var useCase = new CrearEstudianteUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        //asserts
        EstudianteCreado event = (EstudianteCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("ZZZZZZZZ", event.aggregateRootId());
    }
}
