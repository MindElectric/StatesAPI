package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.Pais;
import com.states.StatesAI.domain.dto.PaisDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PaisMapperImpl implements Mapper<Pais, PaisDto> {
    private final ModelMapper modelMapper;

    public PaisMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public PaisDto mapTo(Pais pais) {
        return modelMapper.map(pais, PaisDto.class);
    }

    @Override
    public Pais mapFrom(PaisDto paisDto) {
        return modelMapper.map(paisDto, Pais.class);
    }
}
