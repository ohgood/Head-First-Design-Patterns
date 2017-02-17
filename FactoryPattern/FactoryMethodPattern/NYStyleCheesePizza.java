package FactoryPattern.FactoryMethodPattern;

public class NYStyleCheesePizza extends Pizza{

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Grust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grate Reggiano Cheese");
	}

}
