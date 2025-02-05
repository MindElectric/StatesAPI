package com.states.StatesAI.repositories;
import com.states.StatesAI.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
//import org.springframework.data.repository.CrudRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    @Query("SELECT p FROM Pais p " +
            "LEFT JOIN FETCH p.estado e " +
            "LEFT JOIN FETCH e.ciudad c " +
            "WHERE p.id = :id")
    Optional<Pais> findByIdWithStates(Long id);
}
