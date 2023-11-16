package com.elbaleon.springboot.di.sprinboot.controllers;

import com.elbaleon.springboot.di.sprinboot.models.service.IServices;
import com.elbaleon.springboot.di.sprinboot.models.service.MiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

@Autowired
//@Qualifier("miServicioComplejo")
private IServices services; //= new MiServices();// En vez de la clase concreta implementamosla interfaz, ahora depende de algo generico y no de algo en concrreto

    //Metodo handles
    //Mapear el tipo de peticion
    @GetMapping({"/", "app"})
    public String index(Model model){
        model.addAttribute("objeto", services.operacion()); //pasandoel dato para la vista -- vamos acrear la vista la classe HTML INDEX

        return "index";

    }

   /* @Autowired
    public IndexController(IServices services) {
        this.services = services;
    }*/
}
