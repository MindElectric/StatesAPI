package com.states.StatesAI.domain.dto;
import com.states.StatesAI.domain.Estado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

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
    private String esperanzaDeVida;
    private String formaDeGobierno;
    private String tamanio;
    private Set<Estado> estado;
}
