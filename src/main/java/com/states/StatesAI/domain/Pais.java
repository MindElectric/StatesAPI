package com.states.StatesAI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pais_id_seq")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    private String descripcion;

    private Long poblacion;

    @Column(name = "continente", nullable = false, length = 50)
    private String continente;

    @Column(name = "capital", nullable = true, length = 50)
    private String capital;

    @Column(name = "moneda", nullable = false, length = 100)
    private String moneda;

    @Column(name = "esperanza_de_vida", nullable = false, precision = 5, scale = 2)
    private double esperanzaDeVida;

    @Column(name = "forma_de_gobierno", nullable = false)
    private String formaDeGobierno;


}
