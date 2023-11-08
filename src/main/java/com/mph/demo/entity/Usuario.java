package com.mph.demo.entity;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.mph.demo.shared.BaseEntity;

import jakarta.persistence.Entity;

@Entity
@Table(name="usuario")
@Getter
@Setter
@NoArgsConstructor
public class Usuario extends BaseEntity {
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String rol;
}



