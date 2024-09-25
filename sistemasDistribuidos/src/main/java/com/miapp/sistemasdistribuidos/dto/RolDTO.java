package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String rolId;
    private String nombreRol; // Nombre del rol
    private String descripcionRol; // Descripción del rol (opcional)
}
