package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import opgaver.Library;
import opgaver.Town;

public class LibraryTest {

	@Test
	public void testFee() {
		// arrange
		Library l1 = new Library(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 1), true);
		// assert
		// act
		assertEquals(10, l1.calculateFine(LocalDate.of(2020, 12, 10), LocalDate.of(2020, 12, 15), false));
		assertEquals(20, l1.calculateFine(LocalDate.of(2020, 12, 10), LocalDate.of(2020, 12, 15), true));
		assertEquals(30, l1.calculateFine(LocalDate.of(2020, 12, 10), LocalDate.of(2020, 12, 18), false));
		assertEquals(60, l1.calculateFine(LocalDate.of(2020, 12, 10), LocalDate.of(2020, 12, 18), true));
		assertEquals(45, l1.calculateFine(LocalDate.of(2020, 12, 10), LocalDate.of(2020, 12, 28), false));

	}

	@Test
	public void testTown() {
		Town t1 = new Town(1);

		assertEquals(2000, t1.totalpayment(1, 0));
		assertEquals(1000, t1.totalpayment(0, 1));
		assertEquals(3500, t1.totalpayment(2, 0));
		assertEquals(5000, t1.totalpayment(3, 0));
		assertEquals(1750, t1.totalpayment(0, 2));
		assertEquals(2500, t1.totalpayment(0, 3));
		assertEquals(2750, t1.totalpayment(1, 1));

	}
}
