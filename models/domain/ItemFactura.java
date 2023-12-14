package com.elbaleon.springboot.di.sprinboot.models.domain;

public class ItemFactura {
    private Product product;
    private Integer cantidad;


    public ItemFactura(Product product, Integer cantidad) {
        this.product = product;
        this.cantidad = cantidad;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer calcularImporte(){
        return cantidad * product.getPrecio();
    }

}
