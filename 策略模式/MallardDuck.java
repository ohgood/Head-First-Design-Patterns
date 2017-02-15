package ²ßÂÔÄ£Ê½;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void doplay() {
		System.out.println("I'm a real Mallard duck");
	}

}
