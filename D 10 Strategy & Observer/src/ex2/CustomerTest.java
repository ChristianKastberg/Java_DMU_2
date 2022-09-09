package ex2;

import java.util.Comparator;

public class CustomerTest {

	public static void main(String[] args) {

		Comparator<Customer> comparatorName = new ComparatorName();
		Comparator<Customer> comparatorAge = new ComparatorAge();

		Customer customer1 = new Customer("Hans Ole Henriksen", 50);
		Customer customer2 = new Customer("Michael", 99);

		System.out.printf("Customer 1 = %s%n", customer1);
		System.out.printf("Customer 2 = %s%n", customer2);

		Customer.setComparator(comparatorName);
		System.out.printf("Compared by name (c1, c2)= %s%n", customer1.compareTo(customer2));

		Customer.setComparator(comparatorAge);
		System.out.printf("Compared by age (c1, c2)= %s%n", customer1.compareTo(customer2));

		Customer.setComparator(comparatorName);
		System.out.printf("Compared by name (c1, c2)= %s%n", customer1.compareTo(customer2));

	}
}
