package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.commands.AgregarMateriaCursadaCommand;

public class AgregarMateriaCursadaUseCase extends UseCase<RequestCommand<AgregarMateriaCursadaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarMateriaCursadaCommand> requestCommand){
        var command = requestCommand.getCommand();
        var estudiante = Estudiante.from(command.getIdEstudiante(),retrieveEvents());
        if(estudiante.historiaAcademica().materiasCursadas().containsKey(command.getMateriaCursada())){
            throw new BusinessException(command.getIdEstudiante().value(), "No puede cursar una materia más de una vez");
        }
        estudiante.agregarMateriaCursada(command.getMateriaCursada(),command.getNota());
        emit().onResponse(new ResponseEvents(estudiante.getUncommittedChanges()));
    }
}
