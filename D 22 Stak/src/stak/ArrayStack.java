package stak;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack implements Stack {

	Object[] liste;
	int size;
	

	public ArrayStack(int capacity) {
		liste = new Object[capacity];
		size = 0;
	}

	@Override
	public void push(Object element) {
		if(size == liste.length) {
			liste = Arrays.copyOf(liste, liste.length * 2);
		}	
		liste[size] = element;
		size++;
		

	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			Object o = liste[size - 1];
			liste[size - 1] = null;
			size--;
			return o;
		}
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return liste[size - 1];
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}
	

	@Override
	public String toString() {
		return "ArrayStack [liste=" + Arrays.toString(liste) + ", size=" + size + "]";
	}
	
	
	

	@Override
	public int size() {
		return size;
	}

}
