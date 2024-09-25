package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Eventos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventoId")
    private Integer eventoId;

    @ManyToOne
    @JoinColumn(name = "trabajadorId", nullable = false)
    private Trabajador trabajadorId;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "lugar", nullable = false)
    private String lugar;

}
