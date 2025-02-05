package com.states.StatesAI.domain.dto;

import com.states.StatesAI.domain.Ciudad;
import com.states.StatesAI.domain.Pais;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstadoDto {
    private Long id;
    private String nombre;
    private Long poblacion;
    private String descripcion;
    private String abreviatura;
    private String tamanio;
    private Pais pais;
    private Set<Ciudad> ciudad;
}
