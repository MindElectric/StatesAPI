package com.states.StatesAI.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciudad_id_seq")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = Length.LOB_DEFAULT)
    private String descripcion;

    @Column(name = "tamanio", nullable = false, length = 50)
    private String tamanio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estado_id")
    @ToString.Exclude
    @JsonBackReference
    private Estado estado;

}
