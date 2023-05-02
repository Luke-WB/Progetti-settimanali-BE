package com.design_pattern.controllo_gestione_incendi.gestione_http;

import com.design_pattern.controllo_gestione_incendi.gestione_sonda.AggiornaSonda;

public interface CentroControlloInterface {
	
	public void controllaValoreFumo(AggiornaSonda info);
	
}
