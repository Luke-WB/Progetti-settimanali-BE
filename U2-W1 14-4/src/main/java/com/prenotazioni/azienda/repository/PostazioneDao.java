package com.prenotazioni.azienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.azienda.model.Edificio;
import com.prenotazioni.azienda.model.Postazione;
import com.prenotazioni.azienda.model.Tipo;

@Repository
public interface PostazioneDao extends JpaRepository<Postazione, Long> {
    public List<Postazione> findByDescrizionePostazione(String descrizionePostazione);

    public List<Postazione> findByNumMaxOccupanti(Integer numMaxOccupanti);

    public List<Postazione> findByTipo(Tipo tipo);

    public List<Postazione> findByEdificio(Edificio edificio);

}
