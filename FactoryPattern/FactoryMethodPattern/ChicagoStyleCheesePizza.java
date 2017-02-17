package FactoryPattern.FactoryMethodPattern;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Grust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cute() {
		System.out.println("Cutting the pizza into square slices");
	}
}
