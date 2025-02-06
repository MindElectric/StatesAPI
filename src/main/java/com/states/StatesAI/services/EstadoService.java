package com.states.StatesAI.services;

import com.states.StatesAI.domain.Estado;

import java.util.Optional;

public interface EstadoService {
    Optional<Estado> findOne(Long id);
}
