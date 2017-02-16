package ObserverPattern;

/*布告板*/
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperture;
	
	private float humidity;
	
	private Subject weatherData;
	
	/*注册观察者*/
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperture = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperture + "F degrees and " + humidity + "% humidity");	
	}

}
