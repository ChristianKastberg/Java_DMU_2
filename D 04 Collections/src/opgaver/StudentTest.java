package opgaver;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.addAll(Arrays.asList(02, -3, 7, 10, 12));
		Student s1 = new Student(6, "jonas", grades);
		College c1 = new College("habbo");
		c1.addStudent(s1);
		System.out.println(c1.calcAverage());
		System.out.println(c1.findStudent(6));

	}

}
