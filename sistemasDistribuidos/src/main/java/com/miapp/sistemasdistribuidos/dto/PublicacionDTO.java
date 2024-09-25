package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicacionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer publicacionId; // ID de la publicación (solo en respuesta)
    private Integer trabajadorId; // ID del trabajador asociado
    private String titulo; // Título de la publicación
    private String descripcion; // Descripción de la publicación
    private Integer categoriaId; // ID de la categoría asociada
    private String imagen; // URL de la imagen
    private Double precio; // Precio de la publicación
    private Integer tipoDePrecioId; // ID del tipo de precio
    private LocalDateTime createdAt; // Fecha de creación (solo en respuesta)
    private LocalDateTime updatedAt; // Fecha de actualización (solo en respuesta)
}
