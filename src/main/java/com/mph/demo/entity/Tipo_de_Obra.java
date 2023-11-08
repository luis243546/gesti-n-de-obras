package com.mph.demo.entity;

import com.mph.demo.shared.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tipo_de_obra")
@NoArgsConstructor
public abstract class Tipo_de_Obra extends BaseEntity {
    
    private int idTipo_de_Obra;
    private String nombre;
    private String descripcion;
}
