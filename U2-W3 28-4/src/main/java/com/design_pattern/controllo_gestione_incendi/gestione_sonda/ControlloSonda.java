package com.design_pattern.controllo_gestione_incendi.gestione_sonda;

import com.design_pattern.controllo_gestione_incendi.gestione_http.CentroControlloInterface;
import com.design_pattern.controllo_gestione_incendi.model.Sonda;

public class ControlloSonda implements Observer {
	private final int id;
	private CentroControlloInterface centroControllo;

	public ControlloSonda(int id, CentroControlloInterface centroControllo) {
		this.id = id;
		this.centroControllo = centroControllo;
	}
	
	public int getId() {
		return id;
	}
	
	private AggiornaSonda creaAggiornaSonda(Sonda obj) {
		return new AggiornaSonda(obj.getId(),
					obj.getLatitudine(),
					obj.getLongitudine(),
					obj.getLivelloFumo());
	}

	@Override
	public void aggiorna(Subject obj) {
		AggiornaSonda valoriSonda = creaAggiornaSonda((Sonda) obj);
		centroControllo.controllaValoreFumo(valoriSonda);
	}

}
