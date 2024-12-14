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
public class ImagenesEstadoDto {
    private Long id;
    private String url;
    private Estado estado;
}
