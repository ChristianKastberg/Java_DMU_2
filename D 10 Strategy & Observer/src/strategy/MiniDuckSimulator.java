package strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
		ModelDuck model = new ModelDuck();

		System.out.println("Mallard duck:");
		mallard.performQuack();
		System.out.println("Rubber duck:");
		rubberDuckie.performQuack();
		System.out.println("Decoy duck:");
		decoy.performQuack();

		System.out.println("Model duck:");
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
