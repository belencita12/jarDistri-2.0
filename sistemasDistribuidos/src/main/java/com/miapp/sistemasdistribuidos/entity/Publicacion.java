package com.miapp.sistemasdistribuidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Publicaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publicacionId")
    private Integer publicacionId;

    // Relación muchos a uno con la entidad Usuario
    @ManyToOne
    @JoinColumn(name = "trabajadorId", nullable = false)
    private Trabajador trabajadorId;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "categoriaId", nullable = false)
    private Categoria categoriaId;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "tipoDePrecioId", nullable = false)
    private TipoDePrecio tipoDePrecioId;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

}
