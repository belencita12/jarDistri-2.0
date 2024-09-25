package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer contratoId;
    private Integer publicacionId; // ID de la publicación
    private Integer clienteId;     // ID del cliente
    private Integer trabajadorId;  // ID del trabajador
    private LocalDateTime fechaContrato;
    private Integer estadoId;      // ID del estado
    private Double precio;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
