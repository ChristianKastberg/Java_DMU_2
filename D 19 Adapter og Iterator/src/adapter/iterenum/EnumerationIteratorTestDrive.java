package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {

	public static void main(String args[]) {
		args = new String[] { "Hans", "Jens", "Ulla" }; // added line
		Vector<String> v = new Vector<>(Arrays.asList(args));

		Iterator<String> iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
