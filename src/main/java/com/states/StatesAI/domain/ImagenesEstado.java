package com.states.StatesAI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "imagenes_estado")
public class ImagenesEstado {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = "imagenes_estado_id_seq")
    private Long id;

    private String url;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estado_id")
    private Estado estado;
}
