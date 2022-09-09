package opgaver;

import java.util.*;

public class Student {
	private int StudentNo;
	private String name;
	private List<Integer> grades;

	public Student(int StudentNo, String name, List grades) {
		this.StudentNo = StudentNo;
		this.name = name;
		this.grades = grades;
	}

	public int getStudentNo() {
		return StudentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addGrade(int grade) {
		grades.add(grade);
	}

	public List<Integer> getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		return "StudentNumber = " + StudentNo + ", name = " + name + ", grades " + grades;
	}

}
