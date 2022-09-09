package adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {

	public static void main(String args[]) {
		args = new String[] { "Hans", "Jens", "Ulla" }; // added line
		ArrayList<String> l = new ArrayList<>(Arrays.asList(args));

		Enumeration<String> enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
