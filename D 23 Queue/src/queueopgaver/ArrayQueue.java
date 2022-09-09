package queueopgaver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {

	/**
	 * Constructs an empty queue.
	 */
	private int size;
	private Object[] liste;


	public ArrayQueue(int capasiti) {
		liste = new Object[capasiti];

		
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
	
		if (size == liste.length) {
		liste =	Arrays.copyOf(liste, liste.length * 2);
		
		}
		

			liste[size] = newElement;

			size++;
		}

	

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("liste er tom");
		}else {
			Object resolt = liste[0];
			for(int i = 0 ; i < size - 1 ; i++) {
				System.out.println("size =" + size + " i = " + i );
				liste[i] = liste[i + 1];
			}
			liste[size - 1] = null;
			size--;
			return resolt;
			
		}
	
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		// TODO
		return liste[0];
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		// TODO
		return size;
	}
	
	public String toString() {
		return Arrays.toString(liste);
	}

}
