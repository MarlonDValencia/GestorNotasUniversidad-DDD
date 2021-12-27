package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.commands.ModificarTipologiaCommand;
import com.universidad.informacionacademica.domain.asignatura.commands.OrganizarProgramaCursoCommand;
import com.universidad.informacionacademica.domain.asignatura.events.DocenteCambiado;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.verify;

public class OrganizarProgramaCursoUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void OrganizarProgramaCurso() {
        //Arrange
        Map<String, String> map = new HashMap<String, String>();
        Docente docente = new Docente(IdDocente.of("YYYYYYYYY"),new NombreDocente("Alberto"),new AreaCurricular("Ciencias de la ingenieria"));
        var command = new OrganizarProgramaCursoCommand(IdAsignatura.of("XXXXXXXX"),docente,new ProgramaDelCurso(map));
        var usecase = new OrganizarProgramaCursoUseCase();
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
