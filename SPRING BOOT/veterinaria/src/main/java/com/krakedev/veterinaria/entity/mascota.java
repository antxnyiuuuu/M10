package com.krakedev.veterinaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long id;

    @Column(name = "nombre_mascota", nullable = false, length = 100)
    private String nombre;

    @Column(name = "especie", nullable = false)
    private String especie;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "nombre_dueño", nullable = false)
    private String nombreDueño;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoMascota estado = EstadoMascota.ACTIVO;
}
