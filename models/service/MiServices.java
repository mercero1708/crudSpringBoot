package com.elbaleon.springboot.di.sprinboot.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
//@Primary
//@Component("miServicioSimple")
public class MiServices  implements IServices{

    public String operacion() {
        //retornar lista de objetos mapeados por ej
        return "jecutando un proceso importante simpleeeee...";

    }
}
