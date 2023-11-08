package com.mph.demo.entity;

import com.mph.demo.shared.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="proyecto")
@NoArgsConstructor
public abstract class Proyecto extends BaseEntity {
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private String presupuesto;  


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "tipro_id")
    private Tipo_de_Obra tipo_de_Obra;

}
