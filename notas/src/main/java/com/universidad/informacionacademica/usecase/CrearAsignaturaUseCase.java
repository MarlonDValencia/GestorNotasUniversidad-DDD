package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.CrearAsignaturaCommand;
import com.universidad.informacionacademica.domain.asignatura.values.IdAsignatura;

public class CrearAsignaturaUseCase extends UseCase<RequestCommand<CrearAsignaturaCommand>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<CrearAsignaturaCommand> requestCommand){
        var command = requestCommand.getCommand();
        Asignatura asignatura = new Asignatura(
                command.getIdAsignatura(),
                command.getNombreAsignatura(),
                command.getCreditos(),
                command.getTipologia(),
                command.getProgramaDelCurso(),
                command.getNota(),
                command.getDocente(),
                command.getFacultad(),
                command.getDepartamento()
        );
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }

}
