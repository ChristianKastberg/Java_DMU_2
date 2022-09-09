package KasseretSpørgsmål;

public class Abonnoment {

	private double mdnPris;
	private double minutPris;

	public Abonnoment(double mdnPris, double minutPris) {
		this.mdnPris = mdnPris;
		this.minutPris = minutPris;
	}

	public double AbonnomentPris() {

		return this.mdnPris;
	}

}
