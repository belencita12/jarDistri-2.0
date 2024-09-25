package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer participanteId; // ID del participante (solo en respuesta)
    private Integer actividadId; // ID de la actividad asociada
    private Integer clienteId; // ID del cliente asociado
}
