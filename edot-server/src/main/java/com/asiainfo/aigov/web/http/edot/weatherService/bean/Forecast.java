package com.asiainfo.aigov.web.http.edot.weatherService.bean;

public class Forecast {

	private Weather first;
	
	public Weather getFirst() {
		return first;
	}

	public void setFirst(Weather first) {
		this.first = first;
	}

	public class Weather {
		
		private String weather;
		
		private String temperature;
		
		private String wind;

		public String getWeather() {
			return weather;
		}

		public void setWeather(String weather) {
			this.weather = weather;
		}

		public String getTemperature() {
			return temperature;
		}

		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}

		public String getWind() {
			return wind;
		}

		public void setWind(String wind) {
			this.wind = wind;
		}

	}
	
}
