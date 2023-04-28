package model;

public class CentroControllo {
    private static CentroControlloProxy centroControlloRoma;
    private static CentroControlloProxy centroControlloMilano;
    private static Sonda sondaRoma;
    private static Sonda sondaMilano;
    private static ControlloSonda controlloSondaRoma;
    private static ControlloSonda controlloSondaMilano;

    public static void main(String[] args) {
	sondaRoma = new Sonda(12L, 41.9027835, 12.4963655);
	sondaRoma.setSmockeLevel(7);
	sondaMilano = new Sonda(102L, 45.4654219, 9.1859243);
	sondaMilano.setSmockeLevel(3);
	centroControlloRoma = new CentroControlloProxy();
	centroControlloMilano = new CentroControlloProxy();
	controlloSondaRoma = new ControlloSonda(1l, centroControlloRoma);
	controlloSondaMilano = new ControlloSonda(2l, centroControlloMilano);

	sondaRoma.addObserver(controlloSondaRoma);
	sondaRoma.addObserver(controlloSondaMilano);
	if (sondaRoma.getSmockeLevel() > sondaRoma.SMOCKE_THRESHOLD) {
	    System.out.println("Centro di controllo Roma");
	    controlloSondaRoma.update(sondaRoma);
	}
	if (sondaMilano.getSmockeLevel() > sondaMilano.SMOCKE_THRESHOLD) {
	    System.out.println("Centro di controllo Milano");
	    controlloSondaMilano.update(sondaMilano);
	}
    }

}
