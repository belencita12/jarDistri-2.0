package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "AgendaDetalles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agendaDetalleId")
    private Integer agendaDetalleId;

    @ManyToOne
    @JoinColumn(name = "agendaId", nullable = false)
    private Agenda agendaId;

    @OneToOne
    @JoinColumn(name = "contratoId", nullable = false)
    private Contrato contratoId;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "fechaInicio")
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;

    @Column(name = "horaInicio")
    private LocalTime horaInicio;

    @Column(name = "horaFin")
    private LocalTime horaFin;
}
