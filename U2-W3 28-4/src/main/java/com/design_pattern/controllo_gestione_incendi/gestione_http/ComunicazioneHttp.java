package com.design_pattern.controllo_gestione_incendi.gestione_http;

import org.slf4j.LoggerFactory;
import org.slf4j.*;

public class ComunicazioneHttp extends CanaleComunicazione {

    private static final Logger Logger = LoggerFactory.getLogger(ComunicazioneHttp.class);
    private String url_base;

    public ComunicazioneHttp(String url) {
    this.url_base = url;
    }

    public void sendGet(int SondaNum, double latitudine, double longitudine, int livelloFumo) {
    Logger.info("Allarme Sonda: {} - latitudine: {} longitudine: {} - Livello fumo: {} ", SondaNum, latitudine, longitudine, livelloFumo);
    
    String url = url_base + "?=SondaNum" + SondaNum + "&latitudine=" + latitudine + "&longitudine=" + longitudine + "&smokeLevel=" + livelloFumo;
    Logger.info("Call: {}", url);
    }
}