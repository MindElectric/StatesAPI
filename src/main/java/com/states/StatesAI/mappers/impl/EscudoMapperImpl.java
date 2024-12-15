package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.Escudo;
import com.states.StatesAI.domain.dto.EscudoDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class EscudoMapperImpl implements Mapper<Escudo, EscudoDto> {
    private final ModelMapper modelMapper;

    public EscudoMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public EscudoDto mapTo(Escudo escudo) {
        return modelMapper.map(escudo, EscudoDto.class);
    }

    @Override
    public Escudo mapFrom(EscudoDto escudoDto) {
        return modelMapper.map(escudoDto, Escudo.class);
    }
}
