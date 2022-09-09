package composite.menuiterator_alternative;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class CompositeIterator implements Iterator<MenuI> {
	private Deque<Iterator<MenuI>> stack = new ArrayDeque<>();

	public CompositeIterator(Iterator<MenuI> iterator) {
		stack.push(iterator);
	}

	@Override
	public MenuI next() {
		if (this.hasNext()) {
			Iterator<MenuI> iterator = stack.peek();
			MenuI component = iterator.next();

			if (component instanceof CompositeMenu) {
				CompositeMenu compositeMenu = (CompositeMenu) component;
				stack.push(compositeMenu.createIterator());
			}

			return component;
		} else
			return null;
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty())
			return false;
		else {
			Iterator<MenuI> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return this.hasNext();
			} else
				return true;
		}
	}
}
