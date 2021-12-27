package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.ConsultarNotaActual;

public class ConsultarNotaActualUseCase extends UseCase<RequestCommand<ConsultarNotaActual>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ConsultarNotaActual> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getAsignatura().identity(),retrieveEvents());
        if(command.getNota().value()>5.0 && command.getNota().value()<0){
            throw new BusinessException(""+command.getNota().value(), "La nota es invalida debido a que es mayor a 5 o menor a cero");
        }asignatura.consultarNotaActual(asignatura);
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}
