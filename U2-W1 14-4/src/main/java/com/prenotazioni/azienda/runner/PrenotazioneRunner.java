package com.prenotazioni.azienda.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prenotazioni.azienda.repository.EdificioDao;
import com.prenotazioni.azienda.service.PrenotazioneService;

@Component
public class PrenotazioneRunner implements ApplicationRunner {
    @Autowired
    EdificioDao aiuto;
    @Autowired
    PrenotazioneService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	System.out.println("Run...");
	service.creaUtente();
	service.creaEdificio();
	service.createFakePostazione();

	service.initPostazione(aiuto.edificio1());

    }

}
