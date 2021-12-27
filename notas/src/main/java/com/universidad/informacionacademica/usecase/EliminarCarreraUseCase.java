package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.EliminarCarreraCommand;

public class EliminarCarreraUseCase extends UseCase<RequestCommand<EliminarCarreraCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarCarreraCommand> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getIdAsignatura(),retrieveEvents());

        if(!(asignatura.facultad().carreras().getCarreras().contains(command.getCarrera()))){
            throw new BusinessException(command.getCarrera().toString(), "Dicha carrera no se encuentra en esta facultad por ende no puede ser eliminada");
        }
        asignatura.facultad().eliminarCarrera(command.getCarrera().identity());
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}

