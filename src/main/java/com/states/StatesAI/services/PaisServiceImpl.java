package com.states.StatesAI.services;

import com.states.StatesAI.domain.Pais;
import com.states.StatesAI.repositories.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PaisServiceImpl implements PaisService{
    private final PaisRepository paisRepository;

    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public List<Pais> findAll() {
        return StreamSupport.stream(paisRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Optional<Pais> findOne(Long id) {
        return paisRepository.findById(id);
    }
}
