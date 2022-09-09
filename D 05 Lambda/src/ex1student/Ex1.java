package ex1student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Bent", 25), new Person("Susan", 34), new Person("Mikael", 60),
				new Person("Klaus", 44), new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		Person p44 = findFirst(persons, (Person p) -> p.getAge() == 44);
		System.out.println("44 test " + p44);
		Person ps = findFirst(persons, (Person p1) -> p1.getName().startsWith("S"));
		System.out.println("starts with s test " + ps);
		Person pI = findFirst(persons, (Person pi) -> pi.getName().contains("i"));
		System.out.println("contains i test " + pI);
		Person pAge = findFirst(persons, (Person page) -> page.getName().length() == page.getAge());
		System.out.println("name.length == age test " + pAge);

		// part 2
		System.out.println();
		System.out.println();
		List<Person> po44 = FindAll(persons, (Person p) -> p.getAge() == 44);
		System.out.println("all age 44 " + po44);
		List<Person> pS = FindAll(persons, (Person p1) -> p1.getName().startsWith("S"));
		System.out.println("all starts with s " + pS);
		List<Person> pII = FindAll(persons, (Person pi) -> pi.getName().contains("i"));
		System.out.println("all contains i " + pII);
		List<Person> p5 = FindAll(persons, (Person page) -> page.getName().length() == 5);
		System.out.println("all name length 5 " + p5);
		List<Person> p640 = FindAll(persons, (Person p6) -> p6.getAge() >= 6 && p6.getAge() < 40);
		System.out.println(p640);
	}

	/**
	 * Returns from the list the first person that satisfies the predicate. Returns
	 * null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static List<Person> FindAll(List<Person> list, Predicate<Person> filter) {
		List<Person> temp = new ArrayList<Person>();
		for (Person p : list) {
			if (filter.test(p))
				temp.add(p);

		}
		return temp;
	}
}
