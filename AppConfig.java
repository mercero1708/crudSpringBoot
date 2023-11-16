package com.elbaleon.springboot.di.sprinboot;

import com.elbaleon.springboot.di.sprinboot.models.service.IServices;
import com.elbaleon.springboot.di.sprinboot.models.service.MiServices;
import com.elbaleon.springboot.di.sprinboot.models.service.MiServicesComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class AppConfig {

    @Bean("MiServicesComplejo")
    public IServices registarMiServicio (){
        return new MiServices();
    }

   // @Bean("miServicioSimple")
       public IServices registarMiServicioComplejo (){
        return new MiServicesComplejo();
    }
}
