package com.universidad.informacionacademica.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.asignatura.commands.ModificarTipologia;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ModificarTipologiaUseCase extends UseCase<RequestCommand<ModificarTipologia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarTipologia> requestCommand){
        var command = requestCommand.getCommand();
        var asignatura = Asignatura.from(command.getAsignatura().identity(),retrieveEvents());
        List<String> tipologias = new ArrayList<String>();
        tipologias.add("obligatoria");
        tipologias.add("optativa");
        tipologias.add("electiva");
        if(!tipologias.contains((command.getTipologia().value()).toLowerCase())){
            throw new BusinessException(command.getTipologia().value(), "La tipologia de la materia debe ser obligatoria, optativa o electiva");
        }asignatura.modificarTipologia(command.getAsignatura(),command.getTipologia());
        emit().onResponse(new ResponseEvents(asignatura.getUncommittedChanges()));
    }
}