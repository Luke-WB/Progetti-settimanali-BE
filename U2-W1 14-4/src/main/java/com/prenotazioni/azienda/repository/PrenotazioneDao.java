package com.prenotazioni.azienda.repository;

import org.springframework.data.repository.CrudRepository;

import com.prenotazioni.azienda.model.Prenotazione;

public interface PrenotazioneDao extends CrudRepository<Prenotazione, Long> {

}
