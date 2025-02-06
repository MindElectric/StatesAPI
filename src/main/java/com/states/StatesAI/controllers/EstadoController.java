package com.states.StatesAI.controllers;

import com.states.StatesAI.domain.Estado;
import com.states.StatesAI.domain.dto.EstadoDto;
import com.states.StatesAI.mappers.Mapper;
import com.states.StatesAI.services.EstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EstadoController {
    private final EstadoService estadoService;
    private final Mapper<Estado, EstadoDto> estadoMapper;

    public EstadoController(EstadoService estadoService, Mapper<Estado, EstadoDto> estadoMapper) {
        this.estadoService = estadoService;
        this.estadoMapper = estadoMapper;
    }

    @GetMapping(path = "/estado/{id}")
    public ResponseEntity<EstadoDto> getEstado(@PathVariable("id") Long id){
        Optional<Estado> foundEstado = estadoService.findOne(id);
        return foundEstado.map(estado -> {
            EstadoDto estadoDto = estadoMapper.mapTo(estado);
            return new ResponseEntity(estadoDto, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
