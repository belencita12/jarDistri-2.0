package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Actividades")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actividadId")
    private Integer actividadId;

    @ManyToOne
    @JoinColumn(name = "eventoId", nullable = false)
    private Evento eventoId;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

}
