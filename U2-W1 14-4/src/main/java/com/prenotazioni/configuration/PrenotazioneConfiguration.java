package com.prenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.prenotazioni.model.Edificio;
import com.prenotazioni.model.Postazione;
import com.prenotazioni.model.Tipo;
import com.prenotazioni.model.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioneConfiguration {
    @Bean("CustomPostazione")
    @Scope("prototype")
    public Postazione customPostazione() {
	return new Postazione();
    }

    @Bean("ParamsPostazione")
    @Scope("prototype")
    public Postazione postazioneCrea(String descrizionePostazione, Tipo tipo, Integer numMaxOccupanti,
	    Edificio edificio) {
	return new Postazione(null, descrizionePostazione, tipo, numMaxOccupanti, edificio);
    }

    @Bean("ParamsEdificio")
    @Scope("prototype")
    public Edificio edificioCrea(String nome, String indirizzo, String città) {
	return new Edificio(nome, indirizzo, città);
    }

    @Bean("ParamsUtente")
    @Scope("prototype")
    public Utente utenteCrea(String cognome, String nome, String email) {
	return new Utente(null, cognome, nome, email);
    }

    @Bean("FakePostazione")
    @Scope("prototype")
    public Postazione fakePostazionee() {
	Faker fake = Faker.instance(new Locale("it-IT"));
	Postazione p = new Postazione();
	p.setDescrizionePostazione(fake.funnyName().name());
	p.setNumMaxOccupanti(fake.number().numberBetween(100, 180));
	p.setTipo(Tipo.OPENSPACE);
	p.setEdificio(fakeEdificio());
	return p;
    }

    @Bean("FakeEdificio")
    @Scope("prototype")
    public Edificio fakeEdificio() {
	Faker fake = Faker.instance(new Locale("it-IT"));
	Edificio e = new Edificio();
	e.setCittà(fake.address().cityName());
	e.setIndirizzo(fake.address().streetName());
	e.setNome(fake.funnyName().name());
	return e;
    }

    @Bean("FakeUtente")
    @Scope("prototype")
    public Utente fakeUtente() {
	Faker fake = Faker.instance(new Locale("it-IT"));
	Utente u = new Utente();
	u.setCognome(fake.name().lastName());
	u.setNome(fake.name().firstName());
	u.setEmail(u.getNome() + "." + u.getCognome() + "@gmail.com");
	return u;
    }

}