package KasseretSpørgsmål;

import java.util.ArrayList;

public class mainApp {

	public static void main(String[] args) {

		Abonnoment a1 = new Abonnoment(30, 1);
		TimePakke tp1 = new TimePakke(30, 1, 5);
		UdvidelsesPakke up1 = new UdvidelsesPakke(30, 1, 5, 2);

		ArrayList<Abonnoment> aList = new ArrayList();

		aList.add(a1);
		aList.add(tp1);
		aList.add(up1);

		System.out.println(aList);
		System.out.println(sum(aList));

	}

	// sum
	public static double sum(ArrayList<Abonnoment> list) {
		int sum = 0;
		for (Abonnoment m : list) {
			sum += m.AbonnomentPris();
		}

		return sum;

	}
}
