package com.states.StatesAI.controllers;

import com.states.StatesAI.domain.Pais;
import com.states.StatesAI.domain.dto.PaisDto;
import com.states.StatesAI.mappers.Mapper;
import com.states.StatesAI.services.PaisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class PaisController {
    private final PaisService paisService;
    private final Mapper<Pais, PaisDto> paisMapper;

    public PaisController(PaisService paisService, Mapper<Pais, PaisDto> paisMapper) {
        this.paisService = paisService;
        this.paisMapper = paisMapper;
    }

    @GetMapping(path = "/paises")
    public List<PaisDto> listPaises(){
        List<Pais> pais = paisService.findAll();
        return pais.stream().map(paisMapper::mapTo).collect(Collectors.toList());
    }

    @GetMapping(path = "/paises/{id}")
    public ResponseEntity<PaisDto> getPais(@PathVariable("id") Long id){
        Optional<Pais> foundPais = paisService.findOne(id);
        return foundPais.map(pais -> {
            PaisDto paisDto =paisMapper.mapTo(pais);
            return new ResponseEntity(paisDto, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
