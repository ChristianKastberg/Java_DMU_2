package binarysearchtreestuderende;

public class App {

	public static void main(String[] args) {
		BinarySearchTree<Integer> b1 = new BinarySearchTree<>();
		b1.add(45);
		b1.add(22);
		b1.add(77);
		b1.add(11);
		b1.add(30);
		b1.add(90);
		b1.add(15);
		b1.add(25);
		b1.add(88);

		b1.print();

		System.out.println(b1.findMax());

//		b1.removeMin();
//		b1.print();
//		b1.removeMin();
//		b1.print();
//		b1.removeMin();
//		b1.print();
//		b1.removeMin();
//		b1.print();
		while (!b1.isEmpty()) {
			b1.removeMin();
			b1.print();
		}

	}

}
