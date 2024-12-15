package com.states.StatesAI.services;

import com.states.StatesAI.domain.Pais;

import java.util.List;
import java.util.Optional;

public interface PaisService {
    Pais save(Pais pais);

    List<Pais> findAll();

    Optional<Pais> findOne(Long id);
}
