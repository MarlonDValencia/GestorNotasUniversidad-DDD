package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.ModificarCreditos;

public class ModificarCreditosUseCase extends UseCase<RequestCommand<ModificarCreditos>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarCreditos> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getAsignatura().identity(),retrieveEvents());
        if(command.getCreditos().value()>5){
            throw new BusinessException(command.getAsignatura().identity().value(), "El número máximo de créditos que puede tener una materia es 5");
        }
        asignatura.modificarCreditos(command.getAsignatura(),command.getCreditos());
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}
