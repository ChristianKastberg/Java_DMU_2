package ex2;

import java.util.Comparator;

public class ComparatorName implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		return customer1.getName().compareTo(customer2.getName());
	}

}
