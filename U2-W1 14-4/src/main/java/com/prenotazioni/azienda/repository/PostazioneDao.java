package com.prenotazioni.azienda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.azienda.model.Postazione;
import com.prenotazioni.azienda.model.Tipo;

@Repository
public interface PostazioneDao extends CrudRepository<Postazione, Long> {
    public List<Postazione> findByDescrizionePostazione(String descrizionePostazione);

    public List<Postazione> findByNumMaxOccupanti(Integer numMaxOccupanti);

    public List<Postazione> findByTipo(Tipo tipo);

}
