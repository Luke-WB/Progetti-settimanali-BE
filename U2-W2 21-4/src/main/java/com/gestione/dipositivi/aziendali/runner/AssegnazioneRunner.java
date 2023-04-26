package com.gestione.dipositivi.aziendali.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gestione.dipositivi.aziendali.model.ERole;
import com.gestione.dipositivi.aziendali.model.Ruoli;
import com.gestione.dipositivi.aziendali.repository.RuoliDao;
import com.gestione.dipositivi.aziendali.service.AssegnazioneService;
import com.gestione.dipositivi.aziendali.service.AutorizzazioneService;

@Component
public class AssegnazioneRunner implements ApplicationRunner {
    @Autowired
    AssegnazioneService service;
    @Autowired
    RuoliDao ruoliDao;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AutorizzazioneService autorizzazioneService;
    private Set<Ruoli> adminRole;
    private Set<Ruoli> moderatorRole;
    private Set<Ruoli> userRole;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	System.out.println("Run...");

	service.creaDispositivo();
	System.out.println("Dispositivo Creato!!");
	service.creaDipendente();
	System.out.println("Dipendente Creato!!");

	setRoleDefault();

    }

    private void setRoleDefault() {
	Ruoli admin = new Ruoli();
	admin.setRoleName(ERole.ROLE_ADMIN);
	ruoliDao.save(admin);

	Ruoli user = new Ruoli();
	user.setRoleName(ERole.ROLE_USER);
	ruoliDao.save(user);

	Ruoli moderator = new Ruoli();
	moderator.setRoleName(ERole.ROLE_MODERATOR);
	ruoliDao.save(moderator);

	adminRole = new HashSet<Ruoli>();
	adminRole.add(admin);
	adminRole.add(moderator);
	adminRole.add(user);

	moderatorRole = new HashSet<Ruoli>();
	moderatorRole.add(moderator);
	moderatorRole.add(user);

	userRole = new HashSet<Ruoli>();
	userRole.add(user);
    }

}