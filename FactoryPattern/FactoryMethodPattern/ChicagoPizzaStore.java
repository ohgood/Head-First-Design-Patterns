package FactoryPattern.FactoryMethodPattern;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else {
			return null;
		}
	}

}
