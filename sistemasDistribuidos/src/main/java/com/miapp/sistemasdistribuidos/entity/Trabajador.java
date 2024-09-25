package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Trabajadores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trabajadorId")
    private Integer trabajadorId;

    // Relación uno a uno con la entidad Usuario
    @OneToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private Usuario usuarioId;

    // Campo nombre del trabajo, no puede ser nulo
    @Column(name = "nombreTrabajo", nullable = false)
    private String nombreTrabajo;

    // Campo descripción del trabajo, puede ser nulo
    @Column(name = "descripcionTrabajo", columnDefinition = "TEXT")
    private String descripcionTrabajo;
}

