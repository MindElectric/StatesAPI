package com.states.StatesAI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "escudo")
public class Escudo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = "escudo_id_seq")
    private Long id;

    private String url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estado_id")
    private Estado estado;
}
