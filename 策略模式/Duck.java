package ²ßÂÔÄ£Ê½;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	
	public abstract void doplay();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, eve decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
