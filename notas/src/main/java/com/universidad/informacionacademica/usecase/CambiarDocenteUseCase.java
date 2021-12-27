package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.AbrirCarrera;
import com.universidad.informacionacademica.domain.asignatura.commands.CambiarDocente;
import com.universidad.informacionacademica.domain.asignatura.events.DocenteCambiado;

public class CambiarDocenteUseCase extends UseCase<RequestCommand<CambiarDocente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarDocente> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getIdAsignatura(),retrieveEvents());
        if(command.getDocente().equals(command.getNewDocente())){
            throw new BusinessException(command.getIdAsignatura().value(), "Dicho docente ya es el asignado para esa asignatura");
        }asignatura.cambiarDocente(command.getIdAsignatura(),command.getDocente(),command.getNewDocente());
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}
