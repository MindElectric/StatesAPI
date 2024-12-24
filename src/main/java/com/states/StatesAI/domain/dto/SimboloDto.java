package com.states.StatesAI.domain.dto;

import com.states.StatesAI.domain.Estado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimboloDto {

    private UUID id;

    private String url;

    private Estado estado;
}
