package com.states.StatesAI.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pais")
@ToString
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pais_id_seq")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = Length.LOB_DEFAULT)
    private String descripcion;

    private Long poblacion;

    @Column(name = "continente", nullable = false, length = 50)
    private String continente;

    @Column(name = "capital", length = 50)
    private String capital;

    @Column(name = "moneda", nullable = false, length = 100)
    private String moneda;

    @Column(name = "esperanza_de_vida", nullable = false, length = 30)
    private String esperanzaDeVida;

    @Column(name = "forma_de_gobierno", nullable = false)
    private String formaDeGobierno;

    @Column(name = "tamanio", nullable = false, length = 70)
    private String tamanio;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pais", orphanRemoval = true)
    @ToString.Exclude
    @JsonManagedReference
    private Set<Estado> estado;


}
