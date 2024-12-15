package com.states.StatesAI.mappers.impl;

import com.states.StatesAI.domain.ImagenesEstado;
import com.states.StatesAI.domain.dto.ImagenesEstadoDto;
import com.states.StatesAI.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class ImagenesEstadoMapperImpl implements Mapper<ImagenesEstado, ImagenesEstadoDto> {
    private final ModelMapper modelMapper;

    public ImagenesEstadoMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ImagenesEstadoDto mapTo(ImagenesEstado imagenesEstado) {
        return modelMapper.map(imagenesEstado, ImagenesEstadoDto.class);
    }

    @Override
    public ImagenesEstado mapFrom(ImagenesEstadoDto imagenesEstadoDto) {
        return modelMapper.map(imagenesEstadoDto, ImagenesEstado.class);
    }
}
