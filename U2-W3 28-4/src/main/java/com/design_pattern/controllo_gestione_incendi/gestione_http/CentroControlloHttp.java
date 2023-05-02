package com.design_pattern.controllo_gestione_incendi.gestione_http;

import com.design_pattern.controllo_gestione_incendi.gestione_sonda.AggiornaSonda;

public class CentroControlloHttp implements CentroControlloInterface {

    private ComunicazioneHttp canaleComunicazione;
    private static final String checkUrl = "http://host/control/check";

    public CentroControlloHttp() {
	this.canaleComunicazione = new ComunicazioneHttp(checkUrl);
    }

    @Override
    public void controllaValoreFumo(AggiornaSonda valoriSonda) {

	canaleComunicazione.sendGet(valoriSonda.getSondaNum(), valoriSonda.getLatitudine(),
		valoriSonda.getLongitudine(), valoriSonda.getLivelloFumo());
    }

}