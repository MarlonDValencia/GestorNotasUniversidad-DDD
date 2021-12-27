package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.commands.CrearEstudianteCommand;
import com.universidad.informacionacademica.domain.tutor.Tutor;
import com.universidad.informacionacademica.domain.tutor.commands.CrearTutorCommand;

public class CrearTutorUseCase extends UseCase<RequestCommand<CrearTutorCommand>, ResponseEvents> {
    public void executeUseCase(RequestCommand<CrearTutorCommand> requestCommand){
        var command = requestCommand.getCommand();
        Tutor tutor = new Tutor(
                command.getIdTutor(),
                command.getNombreTutor(),
                command.getEstudianteAsignado(),
                command.getTesisAsignada(),
                command.getCasoDeEstudio()
        );
        emit().onResponse(new ResponseEvents(tutor.getUncommittedChanges()));
    }
}
