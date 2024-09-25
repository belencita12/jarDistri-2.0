package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Agendas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agendaId")
    private Integer agendaId;

    @OneToOne
    @JoinColumn(name = "trabajadorId", nullable = false)
    private Trabajador trabajadorId;

    @ManyToOne
    @JoinColumn(name = "estadoId", nullable = false)
    private Estado estadoId;

    @Column(name = "fechaInicio")
    private LocalDateTime fechaInicio;

    @Column(name = "fechaFin")
    private LocalDateTime fechaFin;
}
