package DecoratorPattern;

/*首先，让Espresso扩展自Beverage类，因为Espresso是一种饮料*/
public class Espresso extends Beverage {
	
	/*为了要设置饮料的描述，我们写了一个构造器。记住description实例变量继承自Beverage*/
	public Espresso() {
		description = "Espresso";
	}
	
	/*计算Espresso价格*/
	public double cost() {
		return 1.99;
	}

}
