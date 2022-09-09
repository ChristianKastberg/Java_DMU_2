package example;

public class PrintArray {

	public static void main(String[] args) {

		// invoke generic printArray method with a Double array
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		printArray(doubleArray);

		// invoke generic printArray method with a Character array
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		printArray(charArray);
		// note char uses the symbol ' not " when defining

		// maxium method test returns 30 as 30 is the largest
		System.out.println(maximum(10, 20, 30));

	}

	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest
		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}
		if (z.compareTo(max) > 0) {
			max = z; // z is the largest now
		}
		return max; // returns the largest object
	}

}
