package ex2;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		return Integer.compare(customer1.getAge(), customer2.getAge());
	}

}
