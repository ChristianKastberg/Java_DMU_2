package queueopgaver;

public class testAfArraykø {

	public static void main(String[] args) {
		ArrayQueue a = new ArrayQueue(2);

		a.enqueue("2");
		a.enqueue("1");
		a.enqueue("66");

		System.out.println(a.dequeue());

		System.out.println(a);

	}

}
