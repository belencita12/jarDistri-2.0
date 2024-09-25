package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Contratos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contratoId")
    private Integer contratoId;

    @ManyToOne
    @JoinColumn(name = "publicacionId", referencedColumnName = "publicacionId", nullable = false)
    private Publicacion publicacionId;

    @ManyToOne
    @JoinColumn(name = "clienteId", referencedColumnName = "clienteId", nullable = false)
    private Cliente clienteId;

    @ManyToOne
    @JoinColumn(name = "trabajadorId", referencedColumnName = "trabajadorId", nullable = false)
    private Trabajador trabajadorId;

    @Column(name = "fechaContrato")
    private LocalDateTime fechaContrato;

    @ManyToOne
    @JoinColumn(name = "estadoId", nullable = false)
    private Estado estadoId;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

}
