package com.elbaleon.springboot.di.sprinboot.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Service
//@Component("miServicioComplejo")
//@Primary
public class MiServicesComplejo implements IServices{

    public String operacion() {
        //retornar lista de objetos mapeados por ej
        return "Ejecutando un proceso importante  Complejo...";

    }
}
