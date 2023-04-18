package com.prenotazioni.azienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.azienda.model.Utente;

@Repository
public interface UtenteDao extends JpaRepository<Utente, Long> {
    public List<Utente> findByCognome(String cognome);

    public List<Utente> findByEmail(String email);

    public List<Utente> findByNome(String nome);

}
