package com.design_pattern.controllo_gestione_incendi.main;

import com.design_pattern.controllo_gestione_incendi.gestione_sonda.ControlloSonda;
import com.design_pattern.controllo_gestione_incendi.model.CentroControlloProxy;
import com.design_pattern.controllo_gestione_incendi.model.Sonda;

public class CentroControllo {

    private static Sonda sondaGenova;
    private static Sonda sondaTorino;
    private static Sonda sondaMilano;
    private static Sonda sondaVenezia;
    private static Sonda sondaRoma;
    private static Sonda sondaPalermo;

    private static ControlloSonda controlloSondaGenova;
    private static ControlloSonda controlloSondaTorino;
    private static ControlloSonda controlloSondaMilano;
    private static ControlloSonda controlloSondaVenezia;
    private static ControlloSonda controlloSondaRoma;
    private static ControlloSonda controlloSondaPalermo;

    private static CentroControlloProxy centroDiControlloGenova;
    private static CentroControlloProxy centroDiControlloTorino;
    private static CentroControlloProxy centroDiControlloMilano;
    private static CentroControlloProxy centroDiControlloVenezia;
    private static CentroControlloProxy centroDiControlloRoma;
    private static CentroControlloProxy centroDiControlloPalermo;

    public static void main(String[] args) {

	// creo le sonde e inizializzo i valori
	sondaGenova = new Sonda(1, 44.4056, 8.9463);
	sondaGenova.setLivelloFumo(10);

	sondaTorino = new Sonda(2, 45.042460, 7.403252);
	sondaTorino.setLivelloFumo(6);

	sondaMilano = new Sonda(3, 45.4654219, 9.1859243);
	sondaMilano.setLivelloFumo(8);

	sondaVenezia = new Sonda(4, 45.4408, 12.3155);
	sondaVenezia.setLivelloFumo(15);

	sondaRoma = new Sonda(5, 41.9027835, 12.4963655);
	sondaRoma.setLivelloFumo(3);

	sondaPalermo = new Sonda(6, 38.1157, 13.3615);
	sondaPalermo.setLivelloFumo(2);

	// inizializzo i centri di controllo
	centroDiControlloGenova = new CentroControlloProxy();
	centroDiControlloTorino = new CentroControlloProxy();
	centroDiControlloMilano = new CentroControlloProxy();
	centroDiControlloVenezia = new CentroControlloProxy();
	centroDiControlloRoma = new CentroControlloProxy();
	centroDiControlloPalermo = new CentroControlloProxy();

	// inizializzo i observer
	controlloSondaGenova = new ControlloSonda(1, centroDiControlloGenova);
	controlloSondaTorino = new ControlloSonda(2, centroDiControlloTorino);
	controlloSondaMilano = new ControlloSonda(3, centroDiControlloMilano);
	controlloSondaVenezia = new ControlloSonda(4, centroDiControlloVenezia);
	controlloSondaRoma = new ControlloSonda(5, centroDiControlloRoma);
	controlloSondaPalermo = new ControlloSonda(6, centroDiControlloPalermo);

	// associo observer alla sonda
	sondaGenova.aggiungiObserver(controlloSondaGenova);
	sondaTorino.aggiungiObserver(controlloSondaTorino);
	sondaMilano.aggiungiObserver(controlloSondaMilano);
	sondaVenezia.aggiungiObserver(controlloSondaVenezia);
	sondaRoma.aggiungiObserver(controlloSondaRoma);
	sondaPalermo.aggiungiObserver(controlloSondaPalermo);

	// controllo se valori fumo sopra soglia ed eventualmente aggiorno valori
	if (sondaGenova.getLivelloFumo() > sondaGenova.VALORE_CRITICO) {
	    controlloSondaGenova.aggiorna(sondaGenova);
	}

	if (sondaTorino.getLivelloFumo() > sondaTorino.VALORE_CRITICO) {
	    controlloSondaTorino.aggiorna(sondaTorino);
	}

	if (sondaMilano.getLivelloFumo() > sondaMilano.VALORE_CRITICO) {
	    controlloSondaMilano.aggiorna(sondaMilano);
	}

	if (sondaVenezia.getLivelloFumo() > sondaVenezia.VALORE_CRITICO) {
	    controlloSondaVenezia.aggiorna(sondaVenezia);
	}

	if (sondaRoma.getLivelloFumo() > sondaRoma.VALORE_CRITICO) {
	    controlloSondaRoma.aggiorna(sondaRoma);
	}

	if (sondaPalermo.getLivelloFumo() > sondaPalermo.VALORE_CRITICO) {
	    controlloSondaPalermo.aggiorna(sondaPalermo);
	}
    }
}
