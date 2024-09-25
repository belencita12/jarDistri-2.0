package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Calificaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calificacionId")
    private Integer calificacionId;

    @OneToOne
    @JoinColumn(name = "publicacionId", nullable = false)
    private Publicacion publicacionId;

    @Column(name = "calificacionGeneral")
    private Double calificacionGeneral;

}
