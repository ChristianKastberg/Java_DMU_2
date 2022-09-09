package ex2student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(Arrays.asList(new Runner("Ib", 30), new Runner("Per", 50), new Runner("Ole", 27),
				new Runner("Ulla", 40), new Runner("Jens", 35), new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();
		runners.forEach(r -> System.out.println(r.getName() + " LapTime = " + r.getLapTime()));
		System.out.println();
		runners.forEach(r -> {
			if (r.getLapTime() < 30)
				System.out.println("< 30 " + r.getName() + " " + r.getLapTime());
		});
		// sort with comparator
		runners.sort((runner1, runner2) -> {
			return Integer.compare(runner1.getLapTime(), runner2.getLapTime());

		});

	}
}