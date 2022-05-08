package chapter02.observer.impl;

import chapter02.observer.DisplayElement;
import chapter02.observer.Observer;

import chapter02.subject.impl.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("���� ���� : �µ� "+temperature + "F, ���� "+ humidity + "%");
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity =  weatherData.getHumidity();
		display();
	}
	
	 
	
}
