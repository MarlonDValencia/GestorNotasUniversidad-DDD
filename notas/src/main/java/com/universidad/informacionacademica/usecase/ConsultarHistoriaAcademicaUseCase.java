package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.estudiante.Estudiante;
import com.universidad.informacionacademica.domain.estudiante.commands.ConsultarHistoriaAcademica;

public class ConsultarHistoriaAcademicaUseCase extends UseCase<RequestCommand<ConsultarHistoriaAcademica>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ConsultarHistoriaAcademica> requestCommand){
        var command = requestCommand.getCommand();
        var estudiante = Estudiante.from(command.getEstudiante().identity(),retrieveEvents());
        if(estudiante.historiaAcademica().materiasCursadas().isEmpty()){
            throw new BusinessException(command.getEstudiante().identity().value(), "El estudiante no tiene historia academica pues no ha cursado materias");
        }emit().onResponse(new ResponseEvents(estudiante.getUncommittedChanges()));
    }
}
