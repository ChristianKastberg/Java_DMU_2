package adapter.iterenum;

import java.util.*;

public class EI {

	public static void main(String args[]) {
		args = new String[] { "Hans", "Jens", "Ulla" }; // added line
		Vector<String> v = new Vector<>(Arrays.asList(args));

		Enumeration<String> enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
