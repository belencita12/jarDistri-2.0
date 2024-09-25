package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Participantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "participanteId")
    private Integer participanteId;

    @ManyToOne
    @JoinColumn(name = "actividadId", nullable = false)
    private Actividades actividadId;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private Cliente clienteId;
}
