package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.commands.AgregarMateriaCursada;
import com.universidad.informacionacademica.domain.estudiante.commands.CancelarMateria;

public class CancelarMateriaUseCase extends UseCase<RequestCommand<CancelarMateria>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CancelarMateria> requestCommand){
        var command = requestCommand.getCommand();
        var estudiante = Estudiante.from(command.getEstudiante().identity(),retrieveEvents());

        if(!(estudiante.historiaAcademica().materiasCursadas().containsKey(command.getAsignatura()))){
            throw new BusinessException(command.getEstudiante().identity().value(), "Para cancelar una materia la materia debe estar siendo cursada");
        }
        estudiante.cancelarMateria(command.getAsignatura(),estudiante);
        emit().onResponse(new ResponseEvents(estudiante.getUncommittedChanges()));
    }
}
