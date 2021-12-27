package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.EliminarCarreraCommand;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.asignatura.values.NombreFacultad;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.HistoriaAcademica;
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

public class EliminarCarreraUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void EliminarCarrera() {
        //Arrange
        Map<String, String> map = new HashMap<String, String>();
        HashMap<Asignatura, Nota> map2 = new HashMap<Asignatura, Nota>();
        Set<Asignatura> set3 = new HashSet<Asignatura>();

        IdAsignatura idAsignatura = IdAsignatura.of("XXXXXXXX");
        IdCarrera idCarrera = IdCarrera.of("YYYYYYY");
        NombreCarrera nombreCarrera = new NombreCarrera("Ingeniería Electrica");
        NumeroDeCreditos numeroDeCreditos = new NumeroDeCreditos(3);
        EstadoSemestre estadoSemestre = new EstadoSemestre("Matriculado");
        Carrera carrera = new Carrera(idCarrera, nombreCarrera, numeroDeCreditos, estadoSemestre);
        HistoriaAcademica historia = new HistoriaAcademica(IdHistoriaAcademica.of("TTTTTTTT"),map2,new PorcentajeDeAvance(27.3));

        var command = new EliminarCarreraCommand(new IdAsignatura(),new IdFacultad(),new NombreFacultad("Facultad De Minas"),carrera);
        var usecase = new EliminarCarreraUseCase();
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
