package opgaver;

public class Opgaver {

	public static void main(String[] args) {
		System.out.println("Factorial " + factorial(5));
		System.out.println("revFactioral " + revfactorial(5));
		System.out.println("power " + power(3, 4));
		System.out.println("power2 " + power2(2, 3));
		System.out.println("prod " + prod(2, 2));
		System.out.println("prodrus " + prodrus(2, 2));

		String sentence1 = "RANSLIRPA";
		System.out.println("Reverse " + reverse(sentence1));
	}

	public static int factorial(int n) {

		if (n != 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

	public static int revfactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * revfactorial(n - 1);
		}
	}

// n er base nummeret p er hvad n er opløftet i 
	public static int power(int n, int p) {
		if (p == 0) {
			return 1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * power(n, p - 1);
		}
	}

	public static int power2(int n, int p) {
		if (p == 0) {
			return 1;
		} else if (p % 2 != 0) {
			return n * power(n, p - 1);
		} else {
			return n * power(n * n, p / 2);
		}

	}

	public static int prod(int a, int b) {
		if (a == 0) {
			return 0;
		} else if (a == 1) {
			return b;
		} else {
			return prod(a - 1, b) + b;
		}

	}

	public static int prodrus(int a, int b) {
		if (a == 0) {
			return 0;
		} else if (a % 2 != 0) {
			return prodrus(a - 1, 2) + b;
		} else {
			return prodrus(a / 2, 2 * b);
		}
	}

	public static String reverse(String s) {
		{
			if (s.isEmpty()) {
				return s;
			}
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}

}
