package com.elbaleon.springboot.di.sprinboot;

import com.elbaleon.springboot.di.sprinboot.models.domain.ItemFactura;
import com.elbaleon.springboot.di.sprinboot.models.domain.Product;
import com.elbaleon.springboot.di.sprinboot.models.service.IServices;
import com.elbaleon.springboot.di.sprinboot.models.service.MiServices;
import com.elbaleon.springboot.di.sprinboot.models.service.MiServicesComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
@Primary
public class AppConfig {

    @Bean("MiServicesComplejo")
    public IServices registarMiServicio() {
        return new MiServices();
    }

    // @Bean("miServicioSimple")
    public IServices registarMiServicioComplejo() {
        return new MiServicesComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {
        Product producto1 = new Product("Camara Sony", 100);
        Product producto2 = new Product("Bicicleta Bianchi aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);


    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Product producto1 = new Product("Monitor Sony 240 ", 250);
        Product producto2 = new Product("Nptebook Asus ", 500);
        Product producto3 = new Product("Impresora Asus ", 300);
        Product producto4 = new Product("Escritorio Asus ", 400);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 2);
        ItemFactura linea3 = new ItemFactura(producto2, 6);
        ItemFactura linea4 = new ItemFactura(producto2, 6);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}