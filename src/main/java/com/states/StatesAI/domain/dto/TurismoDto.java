package com.states.StatesAI.domain.dto;

import com.states.StatesAI.domain.Ciudad;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TurismoDto {
    private Long id;

    private String nombre;

    private String descripcion;

    private Ciudad ciudad;
}
