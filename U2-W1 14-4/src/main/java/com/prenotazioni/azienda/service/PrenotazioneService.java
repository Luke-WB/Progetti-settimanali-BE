package com.prenotazioni.azienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prenotazioni.azienda.model.Edificio;
import com.prenotazioni.azienda.model.Postazione;
import com.prenotazioni.azienda.model.Utente;
import com.prenotazioni.azienda.repository.EdificioDao;
import com.prenotazioni.azienda.repository.PostazioneDao;
import com.prenotazioni.azienda.repository.UtenteDao;

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

    public List<Postazione> initPostazione(Edificio edificio) {
	List<Postazione> result = new ArrayList<Postazione>();
	repoP.save(fakePostazioneProvider.getObject());
	// log.info("Saved Postazione: {}", post.getCodice());
	result.add(fakePostazioneProvider.getObject());
	return result;
    }

}
