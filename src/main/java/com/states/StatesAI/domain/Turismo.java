package com.states.StatesAI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "turismo")
public class Turismo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turismo_id_seq")
    private Long id;

    private String nombre;

    private String descripcion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;
}
