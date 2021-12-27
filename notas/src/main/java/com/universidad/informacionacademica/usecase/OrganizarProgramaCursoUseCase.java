package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.OrganizarProgramaCurso;
import com.universidad.informacionacademica.domain.estudiante.commands.AgregarMateriaCursada;

public class OrganizarProgramaCursoUseCase extends UseCase<RequestCommand<OrganizarProgramaCurso>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<OrganizarProgramaCurso> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getIdAsignatura(),retrieveEvents());
        if(command.getDocente().equals(asignatura.docente())){
            throw new BusinessException(command.getDocente().NombreDocente().value(), "Ingresa como el docente asignado de la materia");
        }asignatura.organizarProgramaCurso(command.getIdAsignatura(),command.getDocente(),command.getPrograma());
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}
