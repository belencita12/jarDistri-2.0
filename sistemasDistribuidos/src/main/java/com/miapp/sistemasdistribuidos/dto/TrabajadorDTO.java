package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrabajadorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer trabajadorId;
    private Integer usuarioId; // Solo guardamos el ID del usuario, no la entidad completa
    private String nombreTrabajo;
    private String descripcionTrabajo;
}