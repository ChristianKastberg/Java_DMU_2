package opgaver;

import java.util.*;

public class College {
	private String name;
	private ArrayList<Student> students = new ArrayList<Student>();
	private LinkedHashSet<Student> stoodents = new LinkedHashSet<Student>();

	public College(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addStudent(Student student) {
		if (!students.contains(student)) {
			students.add(student);
		}
	}

	public void removeStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		}
	}

	public double calcAverage() {
		double sum = 0;
		int count = 0;
		for (Student stu : students) {
			for (int tal : stu.getGrades()) {
				sum += tal;
			}
			count = stu.getGrades().size();
		}
		return sum / count;
	}

	public Student findStudent(int studentNo) {

		for (Student stu : students) {
			if (stu.getStudentNo() == studentNo) {
				return stu;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "name = " + name + " " + "students = " + students;
	}

}
