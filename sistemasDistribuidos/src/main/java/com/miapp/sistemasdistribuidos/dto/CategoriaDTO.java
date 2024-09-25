package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer categoriaId;
    private String nombreCategoria;
    private String descripcion;
}
