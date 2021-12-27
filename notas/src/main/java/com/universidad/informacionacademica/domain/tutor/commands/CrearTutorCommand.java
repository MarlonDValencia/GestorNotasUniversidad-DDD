package com.universidad.informacionacademica.domain.tutor.commands;

import co.com.sofka.domain.generic.Command;
import com.universidad.informacionacademica.domain.tutor.CasoDeEstudio;
import com.universidad.informacionacademica.domain.tutor.EstudianteAsignado;
import com.universidad.informacionacademica.domain.tutor.TesisAsignada;
import com.universidad.informacionacademica.domain.tutor.values.IdTutor;
import com.universidad.informacionacademica.domain.tutor.values.NombreTutor;

public class CrearTutorCommand extends Command {
    private final IdTutor idTutor;
    private final NombreTutor nombreTutor;
    private final EstudianteAsignado estudianteAsignado;
    private final TesisAsignada tesisAsignada;
    private final CasoDeEstudio casoDeEstudio;


    public CrearTutorCommand(IdTutor idTutor, NombreTutor nombreTutor, EstudianteAsignado estudianteAsignado, TesisAsignada tesisAsignada, CasoDeEstudio casoDeEstudio) {
        this.idTutor = idTutor;
        this.nombreTutor = nombreTutor;
        this.estudianteAsignado = estudianteAsignado;
        this.tesisAsignada = tesisAsignada;
        this.casoDeEstudio = casoDeEstudio;
    }

    public IdTutor getIdTutor() {
        return idTutor;
    }

    public NombreTutor getNombreTutor() {
        return nombreTutor;
    }

    public EstudianteAsignado getEstudianteAsignado() {
        return estudianteAsignado;
    }

    public TesisAsignada getTesisAsignada() {
        return tesisAsignada;
    }

    public CasoDeEstudio getCasoDeEstudio() {
        return casoDeEstudio;
    }


}
