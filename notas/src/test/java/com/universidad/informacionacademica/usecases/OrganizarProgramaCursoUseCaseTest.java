package com.universidad.informacionacademica.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.commands.ModificarTipologiaCommand;
import com.universidad.informacionacademica.domain.asignatura.commands.OrganizarProgramaCursoCommand;
import com.universidad.informacionacademica.domain.asignatura.events.AsignaturaCreada;
import com.universidad.informacionacademica.domain.asignatura.events.DocenteCambiado;
import com.universidad.informacionacademica.domain.asignatura.events.FacultadCreada;
import com.universidad.informacionacademica.domain.asignatura.events.ProgramaDelCursoOrganizado;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.HistoriaAcademica;
import com.universidad.informacionacademica.domain.estudiante.Pensum;
import com.universidad.informacionacademica.domain.estudiante.values.*;
import com.universidad.informacionacademica.usecase.OrganizarProgramaCursoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrganizarProgramaCursoUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void OrganizarProgramaCursoFailing() {
        //Arrange
        Map<String, String> map = new HashMap<String, String>();
        Docente docente = new Docente(IdDocente.of("YYYYYYYYY"),new NombreDocente("Alberto"),new AreaCurricular("Ciencias de la ingenieria"));
        var command = new OrganizarProgramaCursoCommand(IdAsignatura.of("XXXXXXXX"),docente,new ProgramaDelCurso(map));
        var usecase = new OrganizarProgramaCursoUseCase();
        when(repository.getEventsBy("XXXXXXXX")).thenReturn(events());
        usecase.addRepository(repository);
        //Act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("XXXXXXXX")
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Asserts
        ProgramaDelCursoOrganizado event = (ProgramaDelCursoOrganizado) events.get(0);
        Assertions.assertEquals("XXXXXXXX", event.aggregateRootId());
        verify(repository).getEventsBy("XXXXXXXX");
    }
    private List<DomainEvent> events() {
        Set<Carrera> set = new HashSet<Carrera>();
        Set<String> set2 = new HashSet<String>();
        Map<String, String> map = new HashMap<String, String>();
        HashMap<Asignatura, Nota> map2 = new HashMap<Asignatura, Nota>();
        Set<Asignatura> set3 = new HashSet<Asignatura>();
        Set<Carrera> set4 = new HashSet<Carrera>();
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
        IdCarrera idCarrera = IdCarrera.of("YYYYYYY");
        NombreCarrera nombreCarrera = new NombreCarrera("Ingeniería Electrica");
        NumeroDeCreditos numeroDeCreditos = new NumeroDeCreditos(3);
        EstadoSemestre estadoSemestre = new EstadoSemestre("Matriculado");
        Carrera carrera = new Carrera(idCarrera, nombreCarrera, numeroDeCreditos, estadoSemestre);
        HistoriaAcademica historia = new HistoriaAcademica(IdHistoriaAcademica.of("TTTTTTTT"),map2,new PorcentajeDeAvance(27.3));
        Estudiante estudiante = new Estudiante(IdEstudiante.of("ZZZZZZZZ"),new NombreEstudiante("Andres Vargas"),new Semestre(5),set3,carrera,new Pensum(new IdPensum("KKKKKKKKK"),new MateriasObligatorias(set3),new MateriasOptativas(set3)),historia);
        IdAsignatura idAsignatura = IdAsignatura.of("XXXXXXXX");
        IdFacultad idFacultad = IdFacultad.of("ZZZZZZZ");

        return List.of(new AsignaturaCreada(idAsignatura, new NombreAsignatura("Matemáticas"),new Creditos(2),new Tipologia("Obligatoria"),new ProgramaDelCurso(map),new Nota(2.5), docente, facultad, departamento),new FacultadCreada(idFacultad,new NombreFacultad("Facultad de minas"),new Carreras(set4)));
    }
}
