package com.states.StatesAI.domain.dto;

import com.states.StatesAI.domain.Pais;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstadoDto {
    private Long id;
    private String nombre;
    private String abreviatura;

    private Long poblacion;

    private String descripcion;
    private Pais pais;
}
