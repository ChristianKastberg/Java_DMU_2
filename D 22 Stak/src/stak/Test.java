package stak;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		//ArrayStack arrayStack = new ArrayStack(3);
		Stack<String> arrayStack = new Stack<>();
		arrayStack.push("mads");
		arrayStack.push("tim");
		System.out.println(arrayStack.toString());
		arrayStack.push("magnus");
		arrayStack.push("x-man");
		
		System.out.println(arrayStack.size());
		System.out.println(arrayStack.toString());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.toString());
		System.out.println(arrayStack.size());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.size());
		
		
	}
}
