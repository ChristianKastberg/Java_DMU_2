package observer_withsubject;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

//		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();

		weatherData.addObserver(statisticsDisplay);
		weatherData.addObserver(currentDisplay);
		weatherData.addObserver(forecastDisplay);
		weatherData.addObserver(heatIndexDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
