package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.Simbolo;
import com.states.StatesAI.domain.dto.SimboloDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class EscudoMapperImpl implements Mapper<Simbolo, SimboloDto> {
    private final ModelMapper modelMapper;

    public EscudoMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public SimboloDto mapTo(Simbolo simbolo) {
        return modelMapper.map(simbolo, SimboloDto.class);
    }

    @Override
    public Simbolo mapFrom(SimboloDto simboloDto) {
        return modelMapper.map(simboloDto, Simbolo.class);
    }
}
