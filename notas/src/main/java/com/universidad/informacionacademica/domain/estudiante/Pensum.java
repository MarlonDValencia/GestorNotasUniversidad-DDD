package com.universidad.informacionacademica.domain.estudiante;

import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.asignatura.Asignatura;
import com.universidad.informacionacademica.domain.estudiante.values.IdPensum;
import com.universidad.informacionacademica.domain.estudiante.values.MateriasObligatorias;
import com.universidad.informacionacademica.domain.estudiante.values.MateriasOptativas;

public class Pensum extends Entity<IdPensum> {
    private final MateriasObligatorias materiasObligatorias;
    private final MateriasOptativas materiasOptativas;

    public Pensum(IdPensum idPensum, MateriasObligatorias materiasObligatorias, MateriasOptativas materiasOptativas) {
        super(idPensum);
        this.materiasObligatorias = materiasObligatorias;
        this.materiasOptativas = materiasOptativas;
    }

    public void eliminarMateriasDelPensum(Asignatura asignatura){
        var id = asignatura.identity();
        this.materiasObligatorias.getMateriasObligatorias().removeIf(materia -> materia.identity().equals(id));
    }

    public MateriasObligatorias materiasObligatorias() {
        return materiasObligatorias;
    }

    public MateriasOptativas materiasOptativas() {
        return materiasOptativas;
    }
}
