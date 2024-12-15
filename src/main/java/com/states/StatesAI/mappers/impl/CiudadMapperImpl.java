package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.Ciudad;
import com.states.StatesAI.domain.dto.CiudadDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CiudadMapperImpl implements Mapper<Ciudad, CiudadDto> {
    private final ModelMapper modelMapper;

    public CiudadMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CiudadDto mapTo(Ciudad ciudad) {
        return modelMapper.map(ciudad, CiudadDto.class);
    }

    @Override
    public Ciudad mapFrom(CiudadDto ciudadDto) {
        return modelMapper.map(ciudadDto, Ciudad.class);
    }
}
