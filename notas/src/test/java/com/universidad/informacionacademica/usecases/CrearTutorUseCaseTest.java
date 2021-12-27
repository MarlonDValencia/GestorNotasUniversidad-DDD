package com.universidad.informacionacademica.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.values.Nota;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.HistoriaAcademica;
import com.universidad.informacionacademica.domain.estudiante.Pensum;
import com.universidad.informacionacademica.domain.estudiante.commands.CrearEstudianteCommand;
import com.universidad.informacionacademica.domain.estudiante.events.EstudianteCreado;
import com.universidad.informacionacademica.domain.estudiante.values.*;
import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;
import com.universidad.informacionacademica.domain.tutor.Tutor;
import com.universidad.informacionacademica.domain.tutor.commands.CrearTutorCommand;
import com.universidad.informacionacademica.domain.tutor.events.TutorCreado;
import com.universidad.informacionacademica.domain.tutor.values.*;
import com.universidad.informacionacademica.usecase.CrearTutorUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CrearTutorUseCaseTest {
    @Test
    void CrearTutor() {
        //arrange
        var command = new CrearTutorCommand(
                new IdTutor("XXXXXXXX"),
                new NombreTutor("Jairo"),
                new EstudianteAsignado(
                        new IdEstudianteAsignado("ZZZZZZZ"),
                        new NombreEstudianteAsignado("Carlos"),
                        new CarreraEstudianteAsignado("Matemáticas"),
                        new EstadoTesis("Recibida")),
                new TesisAsignada(
                        new IdTesisAsignada("YYYYYYYYY"),
                        new TemaTesis("Cartas"),
                        new EstadoTesis("Entregada")),
                new CasoDeEstudio(new IdCasoDeEstudio("AAAAAAAAA"),new FuenteDeInvestigacion("Wikipedia.com"),new EstadoDeAprobacion("Aprobada")
                )
        );
        var useCase = new CrearTutorUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        //asserts
        TutorCreado event = (TutorCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
    }
}
