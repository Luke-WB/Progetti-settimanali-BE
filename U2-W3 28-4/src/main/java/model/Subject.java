package model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<Observer>();

    public void notifyObservers() {
	this.getObservers().forEach(elem -> elem.update(this));
    }

    public void addObserver(Observer obs) {
	this.getObservers().add(obs);
    }

    public boolean removeObservers(Observer obs) {
	return this.getObservers().remove(obs);
    }

    private List<Observer> getObservers() {
	return observers;
    };

}
