package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer eventoId; // ID del evento
    private Integer trabajadorId; // ID del trabajador asociado
    private LocalDate fecha; // Fecha del evento
    private String lugar; // Lugar del evento
}
