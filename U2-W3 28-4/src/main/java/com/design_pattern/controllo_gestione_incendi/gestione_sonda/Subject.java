package com.design_pattern.controllo_gestione_incendi.gestione_sonda;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private final List<Observer> observers = new ArrayList<Observer>();
		
	public List<Observer> getObservers(){
		return observers;
	}
	
	public void aggiungiObserver(Observer obs) {
		List<Observer> listaObserver = this.getObservers();
		listaObserver.add(obs);
	}
	
	public boolean rimuoviObserver(Observer obs) {
		List<Observer> listaObserver = this.getObservers();
		return listaObserver.remove(obs);
	}
	
	public void notificaObservers() {
		List<Observer> listaObserver = this.getObservers();
		listaObserver.forEach(obs -> obs.aggiorna(this));
	}	
	
}
