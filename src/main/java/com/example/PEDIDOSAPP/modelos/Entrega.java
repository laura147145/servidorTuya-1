package com.example.PEDIDOSAPP.modelos;

import com.example.PEDIDOSAPP.ayudas.enums.EntregaEnum;

import java.time.LocalDate;

public class Entrega {
    private Integer id;
    private Integer idPedido;
    private Integer idRepartidor;
    private LocalDate fechaEntrega;
    private EntregaEnum estadoEntrega;

    public Entrega() {
    }

    public Entrega(Integer id, Integer idPedido, Integer idRepartidor, LocalDate fechaEntrega, EntregaEnum estadoEntrega) {
        this.id = id;
        this.idPedido = idPedido;
        this.idRepartidor = idRepartidor;
        this.fechaEntrega = fechaEntrega;
        this.estadoEntrega = estadoEntrega;
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

    public Integer getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EntregaEnum getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(EntregaEnum estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }
}
