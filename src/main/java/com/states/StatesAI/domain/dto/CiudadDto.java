package com.states.StatesAI.domain.dto;

import com.states.StatesAI.domain.Estado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CiudadDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private Estado estado;
}
