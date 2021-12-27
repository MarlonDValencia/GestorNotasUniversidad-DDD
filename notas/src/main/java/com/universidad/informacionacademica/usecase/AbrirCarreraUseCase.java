package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.Facultad;
import com.universidad.informacionacademica.domain.asignatura.commands.AbrirCarrera;
import com.universidad.informacionacademica.domain.estudiante.commands.AgregarMateriaCursada;

public class AbrirCarreraUseCase extends UseCase<RequestCommand<AbrirCarrera>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AbrirCarrera> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getIdAsignatura(),retrieveEvents());

        if(asignatura.facultad().carreras().getCarreras().contains(command.getCarrera())){
            throw new BusinessException(command.getCarrera().toString(), "Dicha carrera ya se encuentra en la facultad");
        }
        asignatura.facultad().abrirNuevaCarrera(command.getCarrera());
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}
