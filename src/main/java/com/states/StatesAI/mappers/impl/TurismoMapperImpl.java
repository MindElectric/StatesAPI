package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.Turismo;
import com.states.StatesAI.domain.dto.TurismoDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class TurismoMapperImpl implements Mapper<Turismo, TurismoDto> {
    private final ModelMapper modelMapper;

    public TurismoMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public TurismoDto mapTo(Turismo turismo) {
        return modelMapper.map(turismo, TurismoDto.class);
    }

    @Override
    public Turismo mapFrom(TurismoDto turismoDto) {
        return modelMapper.map(turismoDto, Turismo.class);
    }
}
