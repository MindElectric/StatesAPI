package com.states.StatesAI.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaisDto {
    private Long id;

    private String nombre;

    private String descripcion;

    private Long poblacion;

    private String continente;

    private String capital;

    private String moneda;

    private double esperanzaDeVida;

    private String formaDeGobierno;
}
