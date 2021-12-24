package com.universidad.informacionacademica.domain.asignatura;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import com.universidad.informacionacademica.domain.asignatura.values.AreaEncargada;
import com.universidad.informacionacademica.domain.asignatura.values.IdDepartamento;
import com.universidad.informacionacademica.domain.asignatura.values.Miembros;

import java.util.Objects;

public class Departamento extends Entity<IdDepartamento>{
    protected Miembros miembros;
    protected AreaEncargada areaEncargada;
    public Departamento(IdDepartamento idDepartamento, Miembros miembros, AreaEncargada areaEncargada) {
        super(idDepartamento);
        this.areaEncargada  = areaEncargada;
        this.miembros = miembros;
    }
    public void modificarCreditosDeUnaMateria(Asignatura asignatura){
        Objects.requireNonNull(asignatura);
    }
    public void cambiarTipologiaDeUnaMateria(Asignatura asignatura){
        Objects.requireNonNull(asignatura);
    }
}
