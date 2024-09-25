package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CalificacionesDetalles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calificacionDetalleId")
    private Integer calificacionDetalleId;

    @ManyToOne
    @JoinColumn(name = "calificacionId", nullable = false)
    private Calificacion calificacionId;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente clienteId;

    @Column(name = "fechaCalificacion")
    private LocalDate fecha;

    @Column(name = "calificacion")
    private Double calificacion;

    @Column(name = "comentario", columnDefinition = "TEXT")
    private String comentario;
}
