package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer calificacionId;
    private Integer publicacionId; // ID de la publicación asociada
    private Double calificacionGeneral;
}
