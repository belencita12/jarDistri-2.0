package com.miapp.sistemasdistribuidos.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolId")
    private Integer rolId;

    @Column(name = "nombreRol", nullable = false)
    private String nombreRol;

    @Column(name = "descripcionRol", columnDefinition = "TEXT")
    private String descripcionRol;
}