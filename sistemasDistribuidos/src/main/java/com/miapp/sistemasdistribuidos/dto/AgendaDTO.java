package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer agendaId;
    private Integer trabajadorId; // ID del trabajador asociado
    private Integer estadoId;     // ID del estado asociado
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
}
