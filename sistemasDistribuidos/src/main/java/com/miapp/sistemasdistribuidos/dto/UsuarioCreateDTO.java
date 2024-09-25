package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCreateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre; // Nombre del usuario
    private String email; // Email del usuario
    private String contrasena; // Contraseña del usuario
    private String telefono; // Teléfono del usuario
    private String rolId; // ID del rol asociado al usuario
    private String direccion; // Dirección del usuario
    private String imgPerfil; // URL de la imagen de perfil
    private String bio; // Biografía o descripción del usuario
    private Boolean activo; // Estado del usuario, activo o inactivo
}
