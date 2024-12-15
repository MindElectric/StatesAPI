package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.Estado;
import com.states.StatesAI.domain.dto.EstadoDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class EstadoMapperImpl implements Mapper<Estado, EstadoDto> {
    private final ModelMapper modelMapper;

    public EstadoMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public EstadoDto mapTo(Estado estado) {
        return modelMapper.map(estado, EstadoDto.class);
    }

    @Override
    public Estado mapFrom(EstadoDto estadoDto) {
        return modelMapper.map(estadoDto, Estado.class);
    }
}
