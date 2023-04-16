package com.prenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.model.Edificio;
import com.prenotazioni.model.Postazione;
import com.prenotazioni.model.Tipo;

@Repository
public interface PostazioneDao extends CrudRepository<Postazione, Long> {
    public List<Postazione> findByDescrizionePostazione(String descrizionePostazione);

    public List<Postazione> findByNumMaxOccupanti(Integer numMaxOccupanti);

    public List<Postazione> findByTipo(Tipo tipo);

    public List<Postazione> findByEdificio(Edificio edificio);

}
