package com.prenotazioni.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prenotazioni.model.Edificio;
import com.prenotazioni.model.Postazione;
import com.prenotazioni.model.Utente;
import com.prenotazioni.repository.EdificioDao;
import com.prenotazioni.repository.PostazioneDao;
import com.prenotazioni.repository.UtenteDao;

@Service
public class PrenotazioneService {
    @Autowired
    private PostazioneDao repoP;
    @Autowired
    private EdificioDao repoE;
    @Autowired
    private UtenteDao repoU;

    @Autowired
    @Qualifier("FakePostazione")
    private ObjectProvider<Postazione> fakePostazioneProvider;
    @Autowired
    @Qualifier("FakeEdificio")
    private ObjectProvider<Edificio> fakeEdificioProvider;
    @Autowired
    @Qualifier("FakeUtente")
    private ObjectProvider<Utente> fakeUtenteProvider;

    public void createFakePostazione() {
	insertPostazione(fakePostazioneProvider.getObject());
    }

    public void creaEdificio() {
	insertEdificio(fakeEdificioProvider.getObject());
    }

    public void creaUtente() {
	insertUtente(fakeUtenteProvider.getObject());
    }

    public void insertPostazione(Postazione p) {
	repoP.save(p);
    }

    public void insertEdificio(Edificio e) {
	repoE.save(e);
    }

    public void insertUtente(Utente u) {
	repoU.save(u);
    }

}
