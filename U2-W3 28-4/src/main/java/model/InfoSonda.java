package model;

public class InfoSonda {
    private long idSonda;
    private double latitude;
    private double longitude;
    private final int smockeLevel;

    public InfoSonda(long idSonda, double latitude, double longitutde, int smockeLevel) {
	super();
	this.idSonda = idSonda;
	this.latitude = latitude;
	this.longitude = longitutde;
	this.smockeLevel = smockeLevel;
    }

    public long getIdSonda() {
	return idSonda;
    }

    public double getLongitude() {
	return longitude;
    }

    public double getLatitude() {
	return latitude;
    }

    public int getSmockeLevel() {
	return smockeLevel;
    }

}
