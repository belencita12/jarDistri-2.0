package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Tipos de Precios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDePrecio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoDePrecioId")
    private Integer tipoDePrecioId;

    //si es por hora, por jornada xd
    @Column(name = "nombreTipo", nullable = false)
    private String nombreTipo;

}