package com.states.StatesAI.services;

import com.states.StatesAI.domain.Estado;
import com.states.StatesAI.repositories.EstadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EstadoServiceImpl implements EstadoService{
    private final EstadoRepository estadoRepository;

    public EstadoServiceImpl(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    @Transactional
    public Optional<Estado> findOne(Long id) {
        Estado state = estadoRepository.findByIdStates(id).orElseThrow(() -> new RuntimeException("Estado not found"));
        return Optional.of(state);
    }
}
