package stak;

public class tjekparenteser {

	public static void main(String[] args) {
		System.out.println(checkParenteses("(}){"));
		System.out.println(checkParenteses("(3+{5{99{*}}[23[{67}67]]})"));
	}

	public static boolean checkParenteses(String s) {
		ArrayStack aS = new ArrayStack(s.length());
		if (s.isEmpty()) {
			return false;

		} else {
			for (int i = 0; i < s.length(); i++) {

				char c = s.charAt(i);
				if (c == '{' || c == '[' || c == '(') {

					aS.push(c);
				} else if (c == '}') {
					if (aS.isEmpty()) {
						return false;
					}
					char ch = (char) aS.peek();
					if (ch != '{') {
						return false;
					} else {
						aS.pop();
					}

				} else if (c == ')') {
					if (aS.isEmpty()) {
						return false;
					}
					char ch = (char) aS.peek();

					if (ch != '(') {
						return false;
					} else {
						aS.pop();
					}
				} else if (c == ']') {
					if(aS.isEmpty()) {
						return false;
					}
					char ch = (char) aS.peek();
					if (ch != '[') {
						return false;
					} else {
						aS.pop();
					}
				}

			}

		}
		return aS.isEmpty();
	}
}
