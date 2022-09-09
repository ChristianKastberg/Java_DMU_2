package ex1;

public class test {

	public static void main(String[] args) {

		SortedLinkedList linkedList = new SortedLinkedList();

		linkedList.addElement("tim");
		linkedList.addElement("dorte");

		linkedList.addElement("x-man");
		linkedList.addElement("far");
		System.out.println(linkedList.size());
		linkedList.addElement("abe");
		linkedList.addElement("ulla");
		System.out.println(linkedList.size());

		linkedList.removeElement("ulla");
		System.out.println(linkedList.size());
		linkedList.removeElement("abe");
		System.out.println(linkedList.size());

		System.out.println(linkedList.toString());

	}

}
