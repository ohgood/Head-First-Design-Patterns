package DecoratorPattern;

/*首先，必须让Condiment Decorator能取代Beverage， 所以将CondimentDecorat扩展Beverage*/
public abstract class CondimentDecorator extends Beverage {
	
	/*所有的材料装饰者都必须实现getDescription()方法。*/
	public abstract String getDescription();

}
