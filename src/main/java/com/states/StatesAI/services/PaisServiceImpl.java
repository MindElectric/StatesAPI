package com.states.StatesAI.services;

import com.states.StatesAI.domain.Ciudad;
import com.states.StatesAI.domain.Estado;
import com.states.StatesAI.domain.Pais;
import com.states.StatesAI.repositories.PaisRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public Optional<Pais> findOne(Long id) {
        // Fetch country with states (without cities)
        Pais country = paisRepository.findByIdWithStates(id)
                .orElseThrow(() -> new RuntimeException("Country not found"));

        // Debugging: Print states and cities
        for (Estado estado : country.getEstado()) {
            System.out.println("Estado: " + estado.getNombre());

            for (Ciudad ciudad : estado.getCiudad()) {
                System.out.println("  Ciudad: " + ciudad.getNombre());
            }
        }
        return Optional.of(country);
    }
}
