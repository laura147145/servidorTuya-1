package com.example.PEDIDOSAPP.modelos;

import com.example.PEDIDOSAPP.ayudas.enums.PagoEnum;
import com.example.PEDIDOSAPP.ayudas.enums.PagoEstadoEnum;

import java.time.LocalDate;

public class Pago {
    private Integer id;
    private Integer idPedido;
    private PagoEnum metodoPago;
    private PagoEstadoEnum estado;
    private LocalDate fechaPago;

    public Pago() {
    }

    public Pago(Integer id, Integer idPedido, PagoEnum metodoPago, PagoEstadoEnum estado, LocalDate fechaPago) {
        this.id = id;
        this.idPedido = idPedido;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.fechaPago = fechaPago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public PagoEnum getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(PagoEnum metodoPago) {
        this.metodoPago = metodoPago;
    }

    public PagoEstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(PagoEstadoEnum estado) {
        this.estado = estado;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
}
