package com.states.StatesAI.repositories;

import com.states.StatesAI.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    @Query("SELECT e FROM Estado e " +
    "LEFT JOIN FETCH  e.ciudad " +
    "WHERE e.id = :id")
    Optional<Estado> findByIdStates(Long id);
}
