package com.gestione.dipositivi.aziendali.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gestione.dipositivi.aziendali.exception.MyAPIException;
import com.gestione.dipositivi.aziendali.model.Dipendente;
import com.gestione.dipositivi.aziendali.model.ERole;
import com.gestione.dipositivi.aziendali.model.Ruoli;
import com.gestione.dipositivi.aziendali.payload.LoginDto;
import com.gestione.dipositivi.aziendali.payload.RegisterDto;
import com.gestione.dipositivi.aziendali.repository.DipendenteDao;
import com.gestione.dipositivi.aziendali.repository.RuoliDao;
import com.gestione.dipositivi.aziendali.security.JwtTokenProvider;

@Service
public class AutorizzazioneServiceImplement implements AutorizzazioneService {

    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private JwtTokenProvider jwtTokenProvider;
    private DipendenteDao dipendenteDao;
    private RuoliDao ruoliDao;

    public AutorizzazioneServiceImplement(AuthenticationManager authenticationManager, DipendenteDao dipendenteDao,
	    RuoliDao ruoliDao, PasswordEncoder passwordEncoder, JwtTokenProvider jwtTokenProvider) {
	this.authenticationManager = authenticationManager;
	this.dipendenteDao = dipendenteDao;
	this.ruoliDao = ruoliDao;
	this.passwordEncoder = passwordEncoder;
	this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public String login(LoginDto loginDto) {

	Authentication authentication = authenticationManager
		.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));

	SecurityContextHolder.getContext().setAuthentication(authentication);

	String token = jwtTokenProvider.generateToken(authentication);

	return token;
    }

    @Override
    public String register(RegisterDto registerDto) {

	// add check for username exists in database
	if (dipendenteDao.existsByUsername(registerDto.getUsername())) {
	    throw new MyAPIException(HttpStatus.BAD_REQUEST, "Username is already exists!.");
	}

	// add check for email exists in database
	if (dipendenteDao.existsByEmail(registerDto.getEmail())) {
	    throw new MyAPIException(HttpStatus.BAD_REQUEST, "Email is already exists!.");
	}

	Dipendente dipendente = new Dipendente();
	dipendente.setNome(registerDto.getName());
	dipendente.setUsername(registerDto.getUsername());
	dipendente.setEmail(registerDto.getEmail());
	dipendente.setPassword(passwordEncoder.encode(registerDto.getPassword()));

	Set<Ruoli> roles = new HashSet<>();

	if (registerDto.getRoles() != null) {
	    registerDto.getRoles().forEach(role -> {
		Ruoli userRole = ruoliDao.findByRoleName(getRole(role)).get();
		roles.add(userRole);
	    });
	} else {
	    Ruoli userRole = ruoliDao.findByRoleName(ERole.ROLE_USER).get();
	    roles.add(userRole);
	}

	dipendente.setRoles(roles);
	System.out.println(dipendente);
	dipendenteDao.save(dipendente);

	return "User registered successfully!.";
    }

    public ERole getRole(String role) {
	if (role.equals("ROLE_ADMIN"))
	    return ERole.ROLE_ADMIN;
	else if (role.equals("ROLE_MODERATOR"))
	    return ERole.ROLE_MODERATOR;
	else
	    return ERole.ROLE_USER;
    }

}
