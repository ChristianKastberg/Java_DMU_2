package observer_withsubject;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

//		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();

		weatherData.addObserver(statisticsDisplay);
		weatherData.addObserver(currentDisplay);
		weatherData.addObserver(forecastDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
