package com.design_pattern.controllo_gestione_incendi.model;


import com.design_pattern.controllo_gestione_incendi.gestione_http.CentroControlloInterface;
import com.design_pattern.controllo_gestione_incendi.gestione_sonda.AggiornaSonda;


public class CentroControlloProxy implements CentroControlloInterface {
	
	private CentroControlloInterface concreteCentroControllo;
	
	public CentroControlloProxy() {
		concreteCentroControllo = CentroControlloFactory.createCentroControllo();		
	}
	
	@Override
	public void controllaValoreFumo(AggiornaSonda valoriSonda) {
		concreteCentroControllo.controllaValoreFumo(valoriSonda);
	}
	
}
