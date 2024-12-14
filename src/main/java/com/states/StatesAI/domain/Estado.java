package com.states.StatesAI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_id_seq")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;

    @Column(name = "abreviatura", nullable = false, length = 5)
    private String abreviatura;

    private Long poblacion;

    private String descripcion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pais_id")
    private Pais pais;
}
