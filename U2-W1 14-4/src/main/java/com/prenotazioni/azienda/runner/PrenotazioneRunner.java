package com.prenotazioni.azienda.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prenotazioni.azienda.service.PrenotazioneService;

@Component
public class PrenotazioneRunner implements ApplicationRunner {

    @Autowired
    PrenotazioneService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	System.out.println("Run...");
	// service.createFakePostazione();
	service.creaUtente();
	service.creaEdificio();
	service.createFakePostazione();

    }

}
