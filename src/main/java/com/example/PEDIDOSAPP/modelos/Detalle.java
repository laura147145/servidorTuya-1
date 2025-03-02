package com.example.PEDIDOSAPP.modelos;

import jakarta.persistence.*;

import javax.lang.model.element.Name;

@Entity
@Table(name = "DetallePedido")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer id;

//    private Integer idPedido;
//    private  Integer idProducto;
    @Column(nullable = false)
    private int cantidad;
    @Column(length = 10,nullable = false)
    private double subTotal;

    public Detalle() {
    }

    public Detalle(Integer id, int cantidad, double subTotal) {
        this.id = id;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
