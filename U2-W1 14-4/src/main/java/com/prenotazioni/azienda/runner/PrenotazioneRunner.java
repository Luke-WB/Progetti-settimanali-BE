package com.prenotazioni.azienda.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prenotazioni.azienda.repository.EdificioDao;
import com.prenotazioni.azienda.repository.PostazioneDao;
import com.prenotazioni.azienda.repository.UtenteDao;
import com.prenotazioni.azienda.service.PrenotazioneService;

@Component
public class PrenotazioneRunner implements ApplicationRunner {

    @Autowired
    PrenotazioneService service;
    @Autowired
    EdificioDao edificioDao;
    @Autowired
    UtenteDao utenteDao;
    @Autowired
    PostazioneDao postazionDao;
    @Autowired
    EdificioDao aiuto;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	System.out.println("Run...");
	service.creaUtente();
	service.creaEdificio();
	service.createFakePostazione();

	service.creaListaPostazioni(edificioDao.queryEdificioId1());
	service.creaListaPrenotazioniUtente(utenteDao.queryUtenteId1());
	service.creaListaPrenotazioniPostazioni(postazionDao.queryPostazioneId1());

    }

}
