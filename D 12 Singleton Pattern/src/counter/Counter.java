package counter;

public class Counter {
	private static Counter uniqueinstance;
	private static int value;

	private Counter() {
		value = 0;
	}

	public static Counter getInstance() {
		if (uniqueinstance == null) {
			uniqueinstance = new Counter();
		}
		return uniqueinstance;
	}

	public void count() {
		value++;
	}

	public void timesTwo() {
		value = value * 2;
	}

	public void zero() {
		value = 0;

	}

	public int getValue() {
		return value;
	}

}
