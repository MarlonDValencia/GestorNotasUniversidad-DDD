package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.commands.ConsultarNotaActualCommand;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.HistoriaAcademica;
import com.universidad.informacionacademica.domain.estudiante.Pensum;
import com.universidad.informacionacademica.domain.estudiante.commands.ConsultarHistoriaAcademicaCommand;
import com.universidad.informacionacademica.domain.estudiante.events.MateriaCancelada;
import com.universidad.informacionacademica.domain.estudiante.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.verify;

public class ConstultarNotaActualUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void ConsultarNotaActual() {
        //Arrange
        Map<String, String> map = new HashMap<String, String>();
        HashMap<Asignatura, Nota> map2 = new HashMap<Asignatura, Nota>();
        Set<Carrera> set = new HashSet<Carrera>();
        Set<String> set2 = new HashSet<String>();
        Docente docente = new Docente(IdDocente.of("YYYYYYYYY"),new NombreDocente("Alberto"),new AreaCurricular("Ciencias de la ingenieria"));
        Facultad facultad = new Facultad(IdFacultad.of("XXXXXXXX"),new NombreFacultad("Facultad De Ciencias"),new Carreras(set));
        Departamento departamento = new Departamento(IdDepartamento.of("XXXXXXXX"),new Miembros(set2),new AreaEncargada("Fisica"));
        Asignatura asignatura = new Asignatura(IdAsignatura.of("XXXXXXXX"),new NombreAsignatura("Mecanica De Fluidos"),new Creditos(4),new Tipologia("Obligatoria"),new ProgramaDelCurso(map),new Nota(4.2),docente,facultad,departamento);
        var command = new ConsultarNotaActualCommand(asignatura);
        var usecase = new ConsultarNotaActualUseCase();
        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Asserts
        MateriaCancelada event = (MateriaCancelada) events.get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
        verify(repository).getEventsBy("XXXXXXXX");
    }
}
