package com.states.StatesAI.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_id_seq")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = Length.LOB_DEFAULT)
    private String descripcion;

    private Long poblacion;

    @Column(name = "abreviatura", nullable = false, length = 5)
    private String abreviatura;


    @Column(name = "tamanio", nullable = false, length = 70)
    private String tamanio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pais_id")
    @ToString.Exclude
    @JsonBackReference
    private Pais pais;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonManagedReference
    private Set<Ciudad> ciudad;
}
