package com.gestione.dipositivi.aziendali.security;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gestione.dipositivi.aziendali.model.Dipendente;
import com.gestione.dipositivi.aziendali.repository.DipendenteDao;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private DipendenteDao dipendenteDao;

    public CustomUserDetailsService(DipendenteDao dipendenteDao) {
	this.dipendenteDao = dipendenteDao;
    }

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
	Dipendente dipendente = dipendenteDao.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).orElseThrow(
		() -> new UsernameNotFoundException("User not found with username or email: " + usernameOrEmail));

	Set<GrantedAuthority> authorities = dipendente.getRuoli().stream()
		.map((role) -> new SimpleGrantedAuthority(role.getRoleName().toString())).collect(Collectors.toSet());

	return new org.springframework.security.core.userdetails.User(dipendente.getEmail(), dipendente.getPassword(),
		authorities);
    }
}