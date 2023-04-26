package com.gestione.dipositivi.aziendali.service;

import com.gestione.dipositivi.aziendali.payload.LoginDto;
import com.gestione.dipositivi.aziendali.payload.RegisterDto;

public interface AutorizzazioneService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
