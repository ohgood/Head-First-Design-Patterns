package DecoratorPattern;

public class Decat extends Beverage{
	
	public Decat() {
		description = "Decat coffee";
	}

	public double cost() {
		return 0.29;
	}
	
}
