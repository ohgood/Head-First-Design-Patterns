package DecoratorPattern;

/*Beverage是一个抽象类，有两个方法：getDescription()及cost()*/
public abstract class Beverage {
	
	String description = "Unkown Beverage";
	
	/*getDescription()已经在此实现了，但是cost()必须在子类中实现*/
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
