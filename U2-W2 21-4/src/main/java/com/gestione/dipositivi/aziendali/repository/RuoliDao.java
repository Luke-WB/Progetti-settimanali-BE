package com.gestione.dipositivi.aziendali.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.dipositivi.aziendali.model.ERole;
import com.gestione.dipositivi.aziendali.model.Ruoli;

public interface RuoliDao extends JpaRepository<Ruoli, Long> {
    Optional<Ruoli> findByRoleName(ERole roleName);

}
