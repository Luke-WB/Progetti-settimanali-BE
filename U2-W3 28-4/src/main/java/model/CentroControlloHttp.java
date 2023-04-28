package model;

public class CentroControlloHttp implements CentroControlloInterface {
    private ComunicazioneHttp canaleComunicazione;
    private static final String baseUrlNotifica = "http://host/alarm";

    public CentroControlloHttp() {
	this.canaleComunicazione = new ComunicazioneHttp(baseUrlNotifica);
    }

    @Override
    public void rilevaIncendio(InfoSonda info) {
	canaleComunicazione.sendGet(info.getIdSonda(), info.getLatitude(), info.getLongitude(), info.getSmockeLevel());
    }

}
