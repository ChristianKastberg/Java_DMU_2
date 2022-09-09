package singleton.chocolate;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;

	// Private constructor er et must med SingleTon pattern
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (this.isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
			System.out.println("Chocolate boiler filled");
		}
	}

	public void drain() {
		if (!this.isEmpty() && this.isBoiled()) {
			// drain the boiled milk and chocolate
			System.out.println("Chocolate boiler emptied");
			empty = true;
		}
	}

	public void boil() {
		if (!this.isEmpty() && !this.isBoiled()) {
			// bring the contents to a boil
			System.out.println("Chocolate boiler contents boiled");
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
