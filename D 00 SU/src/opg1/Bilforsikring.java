package opg1;

public class Bilforsikring {
	// angiver den til enhver tid gældende
	// grundpræmie for en bilforsikring
	private double grundpræmie;

	/**
	 * Registrerer bilforsikringens grundpræmie
	 */
	public void setGrundpræmie(double grundpræmie) {

	}

	/**
	 * Beregner og returnerer en præmie udregnet ud fra følgende regler: grundpræmie
	 * danner udgangspunkt for præmien * hvis der er tale om unge under 25 tillægges
	 * grundpræmien 25% hvis der er tale om en kvinde reduceres præmien med 5% hvis
	 * man har kørt skadefrit i: 0 til 2 år reduceres præmien med 0% 3 til 5 år
	 * reduceres præmien med 15% 6 til 8 år reduceres præmien med 25% over 8 år
	 * reduceres præmien med 35% ovenstående skal udregnes i den angivne rækkefølge
	 * Krav: grundpræmie er tildelt værdi.
	 */

	public double beregnPræmie(int alder, boolean isKvinde, int skadeFrieÅr) {
		// ikke den return der skal være
		return skadeFrieÅr;
	}
}
