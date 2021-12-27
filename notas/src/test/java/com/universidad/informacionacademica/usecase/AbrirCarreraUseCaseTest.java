package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.commands.AbrirCarreraCommand;
import com.universidad.informacionacademica.domain.asignatura.events.CarreraAbierta;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;
import com.universidad.informacionacademica.domain.asignatura.values.IdFacultad;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.values.EstadoSemestre;
import com.universidad.informacionacademica.domain.estudiante.values.IdCarrera;
import com.universidad.informacionacademica.domain.estudiante.values.NombreCarrera;
import com.universidad.informacionacademica.domain.estudiante.values.NumeroDeCreditos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class AbrirCarreraUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void abrirCarrera() {
        //Arrange
        IdAsignatura idAsignatura = IdAsignatura.of("XXXXXXXX");
        IdCarrera idCarrera = IdCarrera.of("YYYYYYY");
        IdFacultad idFacultad = IdFacultad.of("ZZZZZZZ");
        NombreCarrera nombreCarrera = new NombreCarrera("Ingeniería Electrica");
        NumeroDeCreditos numeroDeCreditos = new NumeroDeCreditos(3);
        EstadoSemestre estadoSemestre = new EstadoSemestre("Matriculado");
        Carrera carrera = new Carrera(idCarrera, nombreCarrera, numeroDeCreditos, estadoSemestre);
        var command = new AbrirCarreraCommand(carrera, idFacultad, idAsignatura);
        var usecase = new AbrirCarreraUseCase();

        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Asserts
        CarreraAbierta event = (CarreraAbierta) events.get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
        Assertions.assertEquals("ZZZZZZZ", event.getIdFacultad().value());
    }

}
