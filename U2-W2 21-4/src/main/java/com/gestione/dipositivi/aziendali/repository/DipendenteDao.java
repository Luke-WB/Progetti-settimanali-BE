package com.gestione.dipositivi.aziendali.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gestione.dipositivi.aziendali.model.Dipendente;

public interface DipendenteDao extends CrudRepository<Dipendente, Long> {
    Optional<Dipendente> findByEmail(String email);

    Optional<Dipendente> findByUsernameOrEmail(String username, String email);

    Optional<Dipendente> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
