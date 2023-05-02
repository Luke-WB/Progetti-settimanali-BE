package com.design_pattern.controllo_gestione_incendi.model;

import com.design_pattern.controllo_gestione_incendi.gestione_sonda.Subject;

public class Sonda extends Subject {

    public final int VALORE_CRITICO = 5;

    private int id;
    private double latitudine;
    private double longitudine;
    private int livelloFumo = 0;

    public Sonda(int id, double latitudine, double longitudine) {
	this.id = id;
	this.latitudine = latitudine;
	this.longitudine = longitudine;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public double getLatitudine() {
	return latitudine;
    }

    public void setLatitudine(double lat) {
	this.latitudine = lat;
    }

    public double getLongitudine() {
	return longitudine;
    }

    public void setLongitudine(double lon) {
	this.longitudine = lon;
    }

    public int getLivelloFumo() {
	return livelloFumo;
    }

    public void setLivelloFumo(int livFum) {
	this.livelloFumo = livFum;
	controlloLivelloFumo(livFum);

    }

    public void controlloLivelloFumo(int livFum) {
	if (livelloFumo > VALORE_CRITICO) {
	    super.notificaObservers();
	}
    }

}
