package strategy;

public class MiniDuckSimulator1 {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("Mallard duck:");
		mallard.performQuack();
		mallard.performFly();
		System.out.println();

		Duck model = new ModelDuck();
		System.out.println("Model duck:");
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
