package queueopgaver;

public class køAflisklist implements QueueI {

	private Node first;
	private Node last;
	private int size;

	class Node {
		public Object data;
		public Node next;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public void enqueue(Object newElement) {
		if (isEmpty()) {
			Node node = new Node();
			node.data = newElement;
			node.next = null;
			last.next = node;
			last = node;
			first = node;
			size++;

		} else {

			Node node = new Node();
			node.data = newElement;
			node.next = null;
			last.next = node;
			last = node;
			size++;

		}
	}

	@Override
	public Object dequeue() {
		Object removed = first.data;
		first = first.next;
		size--;
		return removed;
	}

	@Override
	public Object getFront() {

		return first.data;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public String toString() {
		String tom = "";

		Node temp = first;
		while (temp != null) {
			tom += temp.data + " ";
			temp = temp.next;

		}
		return tom;

	}

}
