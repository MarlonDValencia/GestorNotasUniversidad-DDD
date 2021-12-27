package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.CrearAsignaturaCommand;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.commands.CrearEstudianteCommand;

public class CrearEstudianteUseCase extends UseCase<RequestCommand<CrearEstudianteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEstudianteCommand> requestCommand){
        var command = requestCommand.getCommand();
        Estudiante estudiante = new Estudiante(
                command.getIdEstudiante(),
                command.getNombreEstudiante(),
                command.getSemestre(),
                command.getAsignaturasInscritas(),
                command.getCarrera(),
                command.getPensum(),
                command.getHistoriaAcademica()
        );
        emit().onResponse(new ResponseEvents(estudiante.getUncommittedChanges()));
    }
}
