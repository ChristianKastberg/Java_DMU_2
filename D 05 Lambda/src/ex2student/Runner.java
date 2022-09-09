package ex2student;

import java.util.Comparator;

public class Runner implements Comparator {
	private String name; // not null
	private int lapTime;

	public Runner(String name) {
		this(name, 0);
	}

	public Runner(String name, int lapTime) {
		this.name = name;
		this.lapTime = lapTime;
	}

	@Override
	public String toString() {
		return String.format("Runner[%s, %d sec]", name, lapTime);
	}

	public String getName() {
		return name;
	}

	public int getLapTime() {
		return lapTime;
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
