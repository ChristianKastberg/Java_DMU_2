package ex1;

public class SortedLinkedList {
	private Node first;
	private int count;

	public SortedLinkedList() {
		first = null;
		count = 0;
	}

	/**
	 * Tilf�jer et element til listen, s� listen fortsat er sorteret i henhold til
	 * den naturlige ordning p� elementerne.
	 * 
	 * @param element det der inds�ttes
	 */
	public void addElement(String element) {
		// hvis listen er tom add first
		if (first == null) {
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = first;
			first = newNode;
			count++;
		} else if (first.data.compareTo(element) > 0) {
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = first;
			first = newNode;
			count++;
		} else {
			Node before = first;
			Node after = first.next;
			boolean fundet = false;
			while (!fundet && after == null) {
				if (after.data.compareTo(element) < 0) {
					before = after;
					after = after.next;
				} else {
					fundet = true;
				}

			}
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = after;
			before.next = newNode;
			count++;
		}
		// hvis der skal indsættes f�r eller efter f�rste element
		// hvis vi skal ind i liste og lave en inds�t -- vi skal holde styr p� den den
		// vi er n�et til og den efter
	}

	//
//	/**
//	 * Returnerer antallet af elementer i listen.
//	 */

	public int size() {
		return count;
	}

	/**
	 * Fjerner et element fra listen.
	 * 
	 * @param element det element der fjernes
	 * @return true hvis elementet blev fjernet, men ellers false.
	 */
	public boolean removeElement(String element) {
		if (first == null) {
			return false;
		} else if (first.data.compareTo(element) == 0) {

			first = first.next;
			count--;
			return true;
		} else {
			Node before = first;
			Node after = first.next;
			boolean fundet = false;
			while (!fundet && after != null) {
				if (after.data.compareTo(element) < 0) {
					before = after;
					after = after.next;
				} else {
					fundet = true;
				}

			}
			before.next = after.next;
			count--;
			return true;
		}

	}

//
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

class Node {

	public String data;
	public Node next;

}
