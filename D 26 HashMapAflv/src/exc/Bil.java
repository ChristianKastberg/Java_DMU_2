package exc;

import java.util.HashSet;

public class Bil {

	private int regnr;
	private String mærke, model, farve;

	public Bil(int regnr, String mærke, String model, String farve) {
		this.regnr = regnr;
		this.model = model;
		this.mærke = mærke;
		this.farve = farve;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Regnr: " + regnr + "; \n Mærke: " + mærke + ";\n Model: " + model + ";\n Farve: " + farve + "";
	}

	public static void main(String[] args) {
		HashSet<Bil> hsb = new HashSet<Bil>();

		Bil b1 = new Bil(1, "Toyota", "T100", "Blå");
		Bil b2 = new Bil(1, "Toyota", "T100", "Blå");
		Bil b3 = new Bil(2, "Audi", "XM001", "Lilla");
		Bil b4 = new Bil(3, "Porsche", "P2250", "Grå");
		hsb.add(b1);
		hsb.add(b2);
		hsb.add(b3);
		hsb.add(b4);

		System.out.println(hsb);

	}

}
