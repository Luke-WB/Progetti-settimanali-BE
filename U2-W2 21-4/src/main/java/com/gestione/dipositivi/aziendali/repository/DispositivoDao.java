package com.gestione.dipositivi.aziendali.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.dipositivi.aziendali.model.Dispositivo;

public interface DispositivoDao extends JpaRepository<Dispositivo, Long> {

}
