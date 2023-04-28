package model;

public class Sonda extends Subject {
    public int SMOCKE_THRESHOLD = 5;
    private Long id;
    private double latitude;
    private double longitude;
    private int smockeLevel = 0;

    public Sonda(Long id, double latitude, double longitude) {
	this.id = id;
	this.latitude = latitude;
	this.longitude = longitude;
    }

    public Long getId() {
	return id;
    }

    public double getLatitude() {
	return latitude;
    }

    public double getLongitude() {
	return longitude;
    }

    public int getSmockeLevel() {
	return smockeLevel;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public void setLatitude(double latitude) {
	this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
	this.longitude = longitude;
    }

    public void setSmockeLevel(int smockeLevel) {
	this.smockeLevel = smockeLevel;

	if (smockeLevel > SMOCKE_THRESHOLD) {
	    super.notifyObservers();
	}
    }

}
