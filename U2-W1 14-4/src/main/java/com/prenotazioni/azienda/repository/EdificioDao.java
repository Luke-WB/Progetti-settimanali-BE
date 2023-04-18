package com.prenotazioni.azienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.azienda.model.Edificio;

@Repository
public interface EdificioDao extends JpaRepository<Edificio, Long> {

    public List<Edificio> findByCittà(String città);

    public List<Edificio> findByIndirizzo(String indirizzo);

    public List<Edificio> findBynome(String nome);

}
