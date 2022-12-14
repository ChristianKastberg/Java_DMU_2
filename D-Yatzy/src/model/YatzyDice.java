package model;

import java.util.Arrays;
import java.util.Random;

public class YatzyDice {
	// Face values of the 5 dice.
	// 1 <= values[i] <= 6 for i in [0..5]
	private int[] values = new int[5];

	// Number of times the 5 dice have been thrown.
	// 0 <= throwCount <= 3.
	private int throwCount = 0;

	// Random number generator.
	private Random random = new Random();

	/**
	 * Returns the 5 face values of the dice.
	 */
	public int[] getValues() {
		return values;
	}

	/**
	 * Sets the 5 face values of the dice.<br/>
	 * Pre: 1 <= values[i] <= 6 for i in [0..5].<br/>
	 * Note: This method is only meant to be used in tests.
	 */
	void setValues(int[] values) {
		this.values = values;
	}

	/**
	 * Returns the number of times the 5 dice has been thrown.
	 */
	public int getThrowCount() {
		return throwCount;
	}

	/**
	 * Resets the throw count.
	 */
	public void resetThrowCount() {
		throwCount = 0;
	}

	/**
	 * Rolls the 5 dice. Only rolls dice that are not hold.<br/>
	 * Note: holds[i] is true, if die no. i is hold.
	 */
	// If the dice is not held a new random int is assigned to values[i]

	public void throwDice(boolean[] holds) {

		for (int i = 0; i < values.length; i++) {
			if (!holds[i]) {
				values[i] = 1 + random.nextInt(6);
			}
		}
		throwCount++;

	}

	// -------------------------------------------------------------------------

	/**
	 * Returns all results possible with the current face values.<br/>
	 * The order of the results is the same as on the score board.<br/>
	 * Note: This is an optional method. Comment this method out,<br/>
	 * if you don't want use it.
	 */
	public int[] getResults() {
		int[] results = new int[15];
		for (int i = 0; i <= 5; i++) {
			results[i] = this.sameValuePoints(i + 1);
		}
		results[6] = this.onePairPoints();
		results[7] = this.twoPairPoints();
		results[8] = this.threeSamePoints();
		results[9] = this.fourSamePoints();
		results[10] = this.fullHousePoints();
		results[11] = this.smallStraightPoints();
		results[12] = this.largeStraightPoints();
		results[13] = this.chancePoints();
		results[14] = this.yatzyPoints();

		return results;
	}

	// -------------------------------------------------------------------------

	// Returns an int[7] containing the frequency of face values.
	// Frequency at index v is the number of dice with the face value v, 1 <= v <=
	// 6.
	// Index 0 is not used.
	// Note: This method can be used in several of the following methods.
	private int[] frequency() {
		int[] freq = new int[7];

		for (int i = 0; i < values.length; i++) {
			int freqIndex = values[i];
			freq[freqIndex]++;
		}
		return freq;

	}

	/**
	 * Returns same-value points for the given face value.<br/>
	 * Returns 0, if no dice has the given face value.<br/>
	 * Pre: 1 <= value <= 6;
	 */
	public int sameValuePoints(int value) {

		int[] freq = frequency();

		return freq[value] * value;

	}

	/**
	 * Returns points for one pair (for the face value giving highest points).<br/>
	 * Returns 0, if there aren't 2 dice with the same face value.
	 */
	public int onePairPoints() {
		int freq[] = frequency();
		int result = 0;

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] >= 2) {
				result = i + i;
			}
		}

		return result;
	}

	/**
	 * Returns points for two pairs<br/>
	 * (for the 2 face values giving highest points).<br/>
	 * Returns 0, if there aren't 2 dice with the same face value<br/>
	 * and 2 other dice with the same but different face value.
	 */
	public int twoPairPoints() {

		int freq[] = frequency();
		int lowValue = 0;
		int highValue = 0;

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] >= 2) {
				lowValue = highValue;
				highValue = i + i;
			}
		}

		if (lowValue == 0) {
			return 0;
		}
		return lowValue + highValue;

	}

	/**
	 * Returns points for 3 of a kind.<br/>
	 * Returns 0, if there aren't 3 dice with the same face value.
	 */
	public int threeSamePoints() {
		int freq[] = frequency();
		int result = 0;

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] >= 3) {
				result = i * 3;
			}
		}

		return result;
	}

	/**
	 * Returns points for 4 of a kind.<br/>
	 * Returns 0, if there aren't 4 dice with the same face value.
	 */
	public int fourSamePoints() {
		int freq[] = frequency();
		int result = 0;

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] >= 4) {
				result = i * 4;
			}
		}

		return result;
	}

	/**
	 * Returns points for full house.<br/>
	 * Returns 0, if there aren't 3 dice with the same face value<br/>
	 * and 2 other dice with the same but different face value.
	 */
	public int fullHousePoints() {
		int[] freq = frequency();
		int lowValue = 0;
		int highValue = 0;

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] == 3) {
				highValue = i * 3;
			}
		}
		for (int i = 1; i < freq.length; i++) {
			if (freq[i] == 2) {
				lowValue = i + i;
			}

		}
		if (highValue > 0 && lowValue > 0) {
			return highValue + lowValue;
		} else
			return 0;

	}

	/**
	 * Returns points for small straight.<br/>
	 * Returns 0, if the dice are not showing 1,2,3,4,5.
	 */
	public int smallStraightPoints() {
		int freq[] = frequency();
		if (freq[1] == 1 && freq[2] == 1 && freq[3] == 1 && freq[4] == 1 && freq[5] == 1) {
			return 15;
		} else
			return 0;
	}

	/**
	 * Returns points for large straight.<br/>
	 * Returns 0, if the dice are not showing 2,3,4,5,6.
	 */
	public int largeStraightPoints() {

		int freq[] = frequency();

		if (freq[1] == 0 && freq[2] == 1 && freq[3] == 1 && freq[4] == 1 && freq[5] == 1) {
			return 20;

		} else
			return 0;
	}

	/**
	 * Returns points for chance (the sum of face values).
	 */
	public int chancePoints() {

		int pointsTotal = 0;
		int freq[] = frequency();
		for (int i = 1; i < freq.length; i++) {
			pointsTotal += i * freq[i];
		}
		return pointsTotal;
	}

	/**
	 * Returns points for yatzy (50 points).<br/>
	 * Returns 0, if there aren't 5 dice with the same face value.
	 */
	public int yatzyPoints() {
		int freq[] = frequency();

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] >= 5) {
				return 50;
			}
		}

		return 0;
	}
}
