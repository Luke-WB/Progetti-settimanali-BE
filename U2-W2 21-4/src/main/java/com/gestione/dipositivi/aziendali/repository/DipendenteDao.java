package com.gestione.dipositivi.aziendali.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.dipositivi.aziendali.model.Dipendente;

public interface DipendenteDao extends JpaRepository<Dipendente, Long> {

}
