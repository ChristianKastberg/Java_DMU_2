package storage;

import java.util.HashSet;
import java.util.Set;

import model.Student;
import model.Team;

public class Storage {
	private Set<Team> teams;
	private Set<Student> students;

	public Storage() {
		teams = new HashSet<>();
		students = new HashSet<>();
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	public Set<Team> getAllTeams() {
		return new HashSet<>(teams);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Set<Student> getAllStudents() {
		return new HashSet<>(students);
	}

}
