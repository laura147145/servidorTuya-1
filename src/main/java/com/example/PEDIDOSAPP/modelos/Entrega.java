package com.example.PEDIDOSAPP.modelos;

import com.example.PEDIDOSAPP.ayudas.enums.EntregaEnum;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Entrega")
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega")
    private Integer id;

//    private Integer idPedido;
//    private Integer idRepartidor;

    @Column()
    private LocalDate fechaEntrega;
    @Column()
    private EntregaEnum estadoEntrega;

    public Entrega() {
    }

    public Entrega(Integer id, LocalDate fechaEntrega, EntregaEnum estadoEntrega) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.estadoEntrega = estadoEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
