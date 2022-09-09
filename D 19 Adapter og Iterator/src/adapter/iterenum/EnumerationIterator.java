package adapter.iterenum;

import java.util.*;

// Adapter class. Adaptee is Enumeration.
public class EnumerationIterator implements Iterator<String> {
	private Enumeration<String> enumeration;

	public EnumerationIterator(Enumeration<String> enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public String next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
