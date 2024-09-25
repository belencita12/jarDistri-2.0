package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActividadesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer actividadId;
    private Integer eventoId;  // ID del evento asociado
    private String nombre;
    private String descripcion;
}
