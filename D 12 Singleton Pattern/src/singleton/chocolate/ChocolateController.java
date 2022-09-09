package singleton.chocolate;

public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();

		System.out.println("\n Use boiler:");
		boiler.fill();
		boiler.boil();
		boiler.drain();

		System.out.println("\n Use boiler2:");
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance(); // will return the existing instance
		System.out.println("Boiler contents boiled: " + boiler2.isBoiled());
		System.out.println("Boiler emptied: " + boiler2.isEmpty());
	}
}
