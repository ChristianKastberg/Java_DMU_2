package opgaver;

import java.util.*;

public class UseMethodsWithHashSet {

	public static void main(String[] args) {
		// hashSet no duplicate numbers unlike arraylists
		// a
		Set<Integer> hashSet = new LinkedHashSet<Integer>();
		// b
		hashSet.addAll(Arrays.asList(34, 12, 23, 45, 67, 34, 98));
		// c
		System.out.println(hashSet);
		// d
		hashSet.add(23);
		// e
		System.out.println(hashSet);
		// f
		hashSet.remove(67);
		// g
		System.out.println(hashSet);
		// h
		System.out.println(hashSet.contains(23));
		// i
		System.out.println(hashSet.size());

	}

}
