package strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
