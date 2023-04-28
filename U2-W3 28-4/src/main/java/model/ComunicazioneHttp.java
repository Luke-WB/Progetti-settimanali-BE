package model;

import org.slf4j.LoggerFactory;

public class ComunicazioneHttp extends CanaleComunicazione {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(ComunicazioneHttp.class);
    private String baseurINotifica;

    public ComunicazioneHttp(String baseurINotifica) {
	this.baseurINotifica = baseurINotifica;
    }

    public void sendGet(Long idSonda, double latitude, double longitude, int smockeLevel) {
	Logger.info("Allarme sonda: {} - lat: {} long: {} - Livello fumo: {}", idSonda, latitude, longitude,
		smockeLevel);
	String url = baseurINotifica + "?=idSonda" + idSonda + "&lat=" + latitude + "&lon=" + longitude
		+ "&smockeLevel=" + smockeLevel;
	Logger.info("Call: {}", url);
    }

}
