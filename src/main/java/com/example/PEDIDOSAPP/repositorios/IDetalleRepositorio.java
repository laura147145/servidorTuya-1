package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Detalle;
import com.example.PEDIDOSAPP.modelos.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleRepositorio extends JpaRepository<Detalle,Integer> {
}
