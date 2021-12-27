package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Departamento;
import com.universidad.informacionacademica.domain.asignatura.Docente;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.values.*;
import com.universidad.informacionacademica.domain.estudiante.Carrera;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.HistoriaAcademica;
import com.universidad.informacionacademica.domain.estudiante.Pensum;
import com.universidad.informacionacademica.domain.estudiante.commands.CancelarMateriaCommand;
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

public class CancelarMateriaUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    public void CancelarMateria() {
        //Arrange
        Map<String, String> map = new HashMap<String, String>();
        HashMap<Asignatura, Nota> map2 = new HashMap<Asignatura, Nota>();
        Set<Carrera> set = new HashSet<Carrera>();
        Set<String> set2 = new HashSet<String>();
        Set<Asignatura> set3 = new HashSet<Asignatura>();
        Docente docente = new Docente(IdDocente.of("YYYYYYYYY"),new NombreDocente("Alberto"),new AreaCurricular("Ciencias de la ingenieria"));
        Facultad facultad = new Facultad(IdFacultad.of("XXXXXXXX"),new NombreFacultad("Facultad De Ciencias"),new Carreras(set));
        Departamento departamento = new Departamento(IdDepartamento.of("XXXXXXXX"),new Miembros(set2),new AreaEncargada("Fisica"));
        Asignatura asignatura = new Asignatura(IdAsignatura.of("XXXXXXXX"),new NombreAsignatura("Mecanica De Fluidos"),new Creditos(4),new Tipologia("Obligatoria"),new ProgramaDelCurso(map),new Nota(4.2),docente,facultad,departamento);

        IdCarrera idCarrera = IdCarrera.of("YYYYYYY");
        IdFacultad idFacultad = IdFacultad.of("ZZZZZZZ");
        NombreCarrera nombreCarrera = new NombreCarrera("Ingeniería Electrica");
        NumeroDeCreditos numeroDeCreditos = new NumeroDeCreditos(3);
        EstadoSemestre estadoSemestre = new EstadoSemestre("Matriculado");
        Carrera carrera = new Carrera(idCarrera, nombreCarrera, numeroDeCreditos, estadoSemestre);
        HistoriaAcademica historia = new HistoriaAcademica(IdHistoriaAcademica.of("TTTTTTTT"),map2,new PorcentajeDeAvance(27.3));
        Estudiante estudiante = new Estudiante(IdEstudiante.of("ZZZZZZZZ"),new NombreEstudiante("Andres Vargas"),new Semestre(5),set3,carrera,new Pensum(new IdPensum("KKKKKKKKK"),new MateriasObligatorias(set3),new MateriasOptativas(set3)),historia);

        var command = new CancelarMateriaCommand(asignatura,estudiante);
        var usecase = new CancelarMateriaUseCase();
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
