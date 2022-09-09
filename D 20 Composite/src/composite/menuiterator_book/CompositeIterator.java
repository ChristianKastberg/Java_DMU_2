package composite.menuiterator_book;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class CompositeIterator implements Iterator<MenuComponent> {
	private Deque<Iterator<MenuComponent>> stack = new ArrayDeque<>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public MenuComponent next() {
		if (this.hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();

			stack.push(component.createIterator());

			return component;
		} else
			return null;
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty())
			return false;
		else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return this.hasNext();
			} else
				return true;
		}
	}
}
