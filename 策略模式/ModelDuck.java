package ²ßÂÔÄ£Ê½;

public class ModelDuck extends Duck {
	
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void doplay() {
		System.out.println("i'm a model duck");
	}

}
