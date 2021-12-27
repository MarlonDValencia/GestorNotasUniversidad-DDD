package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.commands.CambiarDocenteCommand;
import com.universidad.informacionacademica.domain.asignatura.events.DocenteCambiado;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.commands.AgregarMateriaCursadaCommand;
import com.universidad.informacionacademica.domain.estudiante.events.MateriaCursadaAgregada;
import com.universidad.informacionacademica.domain.estudiante.values.IdEstudiante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.verify;

public class CambiarDocenteUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void CambiarDocente() {
        //Arrange
        IdAsignatura idAsignatura = IdAsignatura.of("XXXXXXXX");
        Docente docente = new Docente(IdDocente.of("YYYYYYYYY"),new NombreDocente("Alberto"),new AreaCurricular("Ciencias de la ingenieria"));
        Docente docente2 = new Docente(IdDocente.of("ZZZZZZZZZ"),new NombreDocente("Juan"),new AreaCurricular("Ciencias Humanas"));
        var command = new CambiarDocenteCommand(new IdAsignatura("XXXXXX"),docente, docente2);
        var usecase = new CambiarDocenteUseCase();
        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Asserts
        DocenteCambiado event = (DocenteCambiado) events.get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
        verify(repository).getEventsBy("XXXXXXXX");
    }

    @Test
    public void CambiarDocenteFailing() {
        //Arrange
        IdAsignatura idAsignatura = IdAsignatura.of("XXXXXXXX");
        Docente docente = new Docente(IdDocente.of("YYYYYYYYY"),new NombreDocente("Alberto"),new AreaCurricular("Ciencias de la ingenieria"));
        var command = new CambiarDocenteCommand(new IdAsignatura("XXXXXX"),docente, docente);
        var usecase = new CambiarDocenteUseCase();
        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Asserts
        DocenteCambiado event = (DocenteCambiado) events.get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
        verify(repository).getEventsBy("XXXXXXXX");
    }
}
