package ex3;

import java.util.Iterator;

public class Ex3AppArray {
    public static void main(String[] args) {
        ArrayedList<Integer> list = new ArrayedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(0, 11);
        System.out.println(list);
        list.add(2, 4);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.replace(0, 1);
        System.out.println(list);

        System.out.println("list contains 3? " + list.contains(3));
        System.out.println();

        System.out.println("Printing using toArray() method:");
        Object[] numbers = list.toArray();
        for (int i = 0; i < numbers.length; i++) {
            int e = (int) numbers[i];
            System.out.print(e + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Printing using iterator() method:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer e = it.next();
            System.out.print(e + ", ");
        }
        System.out.println();

        System.out.println("Printing using for-each:");
        for (Integer e : list) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
}
