package opgaver;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Library {
	private LocalDate calculatedDate;
	private LocalDate actualDate;
	private boolean adult = true;

	public Library(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
		this.calculatedDate = calculatedDate;
		this.actualDate = actualDate;
		this.adult = adult;
	}

	public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
		long test = calculatedDate.until(actualDate, ChronoUnit.DAYS);
		if (adult && test <= 7 && test >= 1) {
			return 20;
		} else if (!adult && test <= 7 && test >= 1) {
			return 10;
		}
		if (adult && test <= 14 && test >= 7) {
			return 60;
		} else if (!adult && test <= 14 && test >= 7) {
			return 30;
		}
		if (adult && test < 15) {
			return 90;
		} else if (!adult) {
			return 45;
		}

		return 0;

	}

}
