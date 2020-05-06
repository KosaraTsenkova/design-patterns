package exercise;

import java.util.ArrayList;
import java.util.List;

public class Training implements Observable{
	private List<Observer> observers = new ArrayList<Observer>();
	public String exercise;
	
	public void standUp() {
		System.out.println("Trainig is up.");
		exercise = "up";
		notifyObservers();
	}
	public void layDown() {		
		System.out.println("Trainig is down.");
		exercise = "down";
		notifyObservers();
	}
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTrainer(this);
	}
	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);		
	}
	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	@Override
	public String getUpdate() { 		
		return this.exercise;
	}
}
