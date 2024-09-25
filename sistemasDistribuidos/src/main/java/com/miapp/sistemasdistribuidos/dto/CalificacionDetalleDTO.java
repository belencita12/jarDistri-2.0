package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionDetalleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer calificacionDetalleId;
    private Integer calificacionId; // ID de la calificación asociada
    private Integer clienteId;      // ID del cliente asociado
    private LocalDate fecha;
    private Double calificacion;
    private String comentario;
}
