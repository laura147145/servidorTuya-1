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
}
