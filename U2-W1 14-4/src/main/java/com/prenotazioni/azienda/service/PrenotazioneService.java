package com.prenotazioni.azienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prenotazioni.azienda.model.Edificio;
import com.prenotazioni.azienda.model.Postazione;
import com.prenotazioni.azienda.model.Prenotazione;
import com.prenotazioni.azienda.model.Utente;
import com.prenotazioni.azienda.repository.EdificioDao;
import com.prenotazioni.azienda.repository.PostazioneDao;
import com.prenotazioni.azienda.repository.PrenotazioneDao;
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
    private PrenotazioneDao repoPre;

    @Autowired
    @Qualifier("FakePostazione")
    private ObjectProvider<Postazione> fakePostazioneProvider;
    @Autowired
    @Qualifier("FakeEdificio")
    private ObjectProvider<Edificio> fakeEdificioProvider;
    @Autowired
    @Qualifier("FakeUtente")
    private ObjectProvider<Utente> fakeUtenteProvider;
    @Autowired
    @Qualifier("FakePrenotazione")
    private ObjectProvider<Prenotazione> fakePrenotazioneProvider;

    public void createFakePostazione() {
	insertPostazione(fakePostazioneProvider.getObject());
    }

    public void creaEdificio() {
	insertEdificio(fakeEdificioProvider.getObject());
    }

    public void creaUtente() {
	insertUtente(fakeUtenteProvider.getObject());
    }

    public void CreateFPrenotazione() {
	insertPrenotazione(fakePrenotazioneProvider.getObject());
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

    public void insertPrenotazione(Prenotazione pre) {
	repoPre.save(pre);
    }

    public List<Postazione> creaListaPostazioni(Edificio edificio) {
	List<Postazione> listPostazioni = new ArrayList<Postazione>();
	Postazione p1 = repoP.save(fakePostazioneProvider.getObject());
	Postazione p2 = repoP.save(fakePostazioneProvider.getObject());
	Postazione p3 = repoP.save(fakePostazioneProvider.getObject());
	listPostazioni.add(p1);
	listPostazioni.add(p2);
	listPostazioni.add(p3);
	return listPostazioni;
    }

    public List<Prenotazione> creaListaPrenotazioniUtente(Utente utente) {
	List<Prenotazione> listPrenotazioni = new ArrayList<Prenotazione>();
	Prenotazione pre1 = repoPre.save(fakePrenotazioneProvider.getObject());
	Prenotazione pre2 = repoPre.save(fakePrenotazioneProvider.getObject());
	Prenotazione pre3 = repoPre.save(fakePrenotazioneProvider.getObject());
	listPrenotazioni.add(pre1);
	listPrenotazioni.add(pre2);
	listPrenotazioni.add(pre3);
	return listPrenotazioni;
    }

    public List<Prenotazione> creaListaPrenotazioniPostazioni(Postazione Postazione) {
	List<Prenotazione> listPrenotazioni = new ArrayList<Prenotazione>();
	Prenotazione pre1 = repoPre.save(fakePrenotazioneProvider.getObject());
	Prenotazione pre2 = repoPre.save(fakePrenotazioneProvider.getObject());
	Prenotazione pre3 = repoPre.save(fakePrenotazioneProvider.getObject());
	listPrenotazioni.add(pre1);
	listPrenotazioni.add(pre2);
	listPrenotazioni.add(pre3);
	return listPrenotazioni;
    }

}
