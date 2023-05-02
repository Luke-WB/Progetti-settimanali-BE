package com.design_pattern.controllo_gestione_incendi.gestione_sonda;

public class AggiornaSonda {
	private final int SondaNum;
	private final double longitudine;
	private final double latitudine;
	private final int livelloFumo;
	
	public AggiornaSonda(int SondaNum, double longitudine, double latitudine, int livelloFumo) {
		super();
		this.SondaNum = SondaNum;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
		this.livelloFumo = livelloFumo;
	}
	
	public int getSondaNum() {
		return SondaNum;
	}
	
	public double getLongitudine() {
		return longitudine;
	}
	
	public double getLatitudine() {
		return latitudine;
	}
			
	public int getLivelloFumo() {
		return livelloFumo;
	}

}
