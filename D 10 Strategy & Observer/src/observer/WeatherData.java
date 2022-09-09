package observer;

import java.util.*;

public class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;

	//-------------------------------------------------------------------------

	private ArrayList<Observer> observers = new ArrayList<>();

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}

	//-------------------------------------------------------------------------

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		this.notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
