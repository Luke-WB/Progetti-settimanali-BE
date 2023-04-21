package com.gestione.dipositivi.aziendali.configuration;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gestione.dipositivi.aziendali.model.Dipendente;
import com.gestione.dipositivi.aziendali.model.Dispositivo;
import com.gestione.dipositivi.aziendali.model.StatoDispositivo;
import com.gestione.dipositivi.aziendali.model.TipoDispositivo;
import com.gestione.dipositivi.aziendali.repository.DipendenteDao;
import com.gestione.dipositivi.aziendali.repository.DispositivoDao;
import com.github.javafaker.Faker;

@Configuration
public class AssegnazioneConfiguration {

    @Autowired
    DispositivoDao dispositivoDao;
    @Autowired
    DipendenteDao dipendenteDao;

    @Bean("FakeDipendente")
    @Scope("prototype")

    Dipendente fakeDipendente() {
	Faker fake = Faker.instance(new Locale("it-IT"));
	Dipendente d = new Dipendente();
	d.setNome(fake.name().firstName());
	d.setCognome(fake.name().lastName());
	d.setEmail(d.getNome() + "." + d.getCognome() + "@example.com");
	d.setUsername(fake.name().username());
	d.setPassword(fake.internet().password(6, 10, true, true));
	d.setLista_dispositivi((List<Dispositivo>) dispositivoDao.findAll());
	return d;
    }

    @Bean("FakeDispositivo")
    @Scope("prototype")
    Dispositivo fakeDispositivo() {
	Faker fake = Faker.instance(new Locale("it-IT"));
	Dispositivo disp = new Dispositivo();
	int num = fake.number().numberBetween(1, 4);
	if (num == 1) {
	    disp.setTipoDispositivo(TipoDispositivo.LAPTOP);
	} else if (num == 2) {
	    disp.setTipoDispositivo(TipoDispositivo.SMARTPHONE);
	} else if (num == 3) {
	    disp.setTipoDispositivo(TipoDispositivo.TABLET);
	} else {
	    System.out.println("il palazzo va a fuoco scappate!!!");
	}
	num = fake.number().numberBetween(1, 5);
	if (num == 1) {
	    disp.setStatoDispositivo(StatoDispositivo.ASSEGNATO);
	} else if (num == 2) {
	    disp.setStatoDispositivo(StatoDispositivo.DISPONIBILE);
	} else if (num == 3) {
	    disp.setStatoDispositivo(StatoDispositivo.IN_MANUTENZIONE);
	} else if (num == 4) {
	    disp.setStatoDispositivo(StatoDispositivo.DISMESSO);
	} else {
	    System.out.println("il palazzo va a fuoco scappate!!!");
	}
	disp.setLista_dipendenti((List<Dipendente>) dipendenteDao.findAll());
	return disp;
    }
}
