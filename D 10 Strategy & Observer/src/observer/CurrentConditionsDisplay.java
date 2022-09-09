package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		System.out.println("*** Current conditions ***");
		System.out.println(temperature + "F degrees and " + humidity + "% humidity");
	}
}
