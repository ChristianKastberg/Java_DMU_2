package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

// Adapter class. Adaptee is Iterator.
public class IteratorEnumeration implements Enumeration<String> {
	private Iterator<String> iterator;

	public IteratorEnumeration(Iterator<String> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public String nextElement() {
		return iterator.next();
	}
}
