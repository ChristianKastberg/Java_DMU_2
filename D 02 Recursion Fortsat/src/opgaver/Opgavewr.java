package opgaver;

import java.util.ArrayList;

public class Opgavewr {

	public static void main(String[] args) {
		int[] testing = { 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Test expected 4, Result = " + count(testing));
		System.out.println("Test binomial " + binomial(4));
		String s = "emma";
		String x = "NotPalindrome";
		System.out.println("Expected true result = " + isPalindrome(s));
		System.out.println("Expected false result = " + isPalindrome(x));
		System.out.println("test " + calcnumb(3));
		System.out.println(permutations("cat"));
	}

// ex 0
	public static int count(int[] list) {
		return count(list, 0, 0);
	}

	public static int count(int[] list, int i, int j) {
		if (i == list.length - 1) {
			return j;
		} else if (list[i] % 2 == 0) {
			j++;
		}
		return count(list, i + 1, j);
	}

// ex1
	public static int binomial(int n) {
		return binomial(n, 1);
	}

	public static int binomial(int n, int m) {
		if (n == 0 || m == 0) {
			return 1;
		} else {
			return binomial(n - 1, m) + binomial(n - 1, m - 1);
		}
	}

// ex2
	public static boolean isPalindrome(String text) {
		return isPalindrome(text, 0, text.length() - 1);
	}

	public static boolean isPalindrome(String text, int start, int end) {
		if (start >= end) {
			return true;
		} else {
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));
			if (Character.isLetter(first) && Character.isLetter(last)) {
				if (first == last) {
					return isPalindrome(text, start + 1, end - 1);
				} else {
					return false;
				}
			} else if (!Character.isLetter(last)) {
				return isPalindrome(text, start, end - 1);
			} else {
				return isPalindrome(text, start + 1, end);
			}
		}
	}
	// ex 3

	public static int moarec(int n) {
		if (n == 0) {
			return 2;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 5;
		} else if (n % 2 == 0) {
			return 2 * moarec(n - 3) - moarec(n - 1);
		} else {
			return moarec(n - 1) + moarec(n - 2) + (3 * moarec(n - 3));
		}
	}

	public static int calcnumb(int n) {
		return moarec(n);
	}

	// ex4
	public static ArrayList<String> permutations(String word) {
		ArrayList<String> result = new ArrayList<String>();

		if (word.length() == 0) {
			result.add(word);
			return result;
		} else {
			for (int i = 0; i < word.length(); i++) {
				String shorter = word.substring(0, i) + word.substring(i + 1);
				ArrayList<String> shorterPermutations = permutations(shorter);
				for (String s : shorterPermutations) {
					result.add(word.charAt(i) + s);
				}
			}
			return result;
		}
	}
}
