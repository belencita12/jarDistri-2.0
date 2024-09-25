package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendaDetalleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer agendaDetalleId;
    private Integer agendaId;     // ID de la agenda asociada
    private Integer contratoId;   // ID del contrato asociado
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalTime horaInicio;
    private LocalTime horaFin;
}
