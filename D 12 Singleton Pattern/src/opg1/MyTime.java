package opg1;

public class MyTime {
	private int time;

	public MyTime() {
		time = 0;
	}

	public void increase() {
		time++;
	}

	public void reset() {
		time = 0;
	}

	public int getTime() {
		return time;
	}

	@Override
	public String toString() {
		return ("" + time);
	}

}
