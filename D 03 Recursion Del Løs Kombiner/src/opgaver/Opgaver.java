package opgaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.sun.scenario.effect.Merge;

public class Opgaver {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(10, 0));
		ArrayList<Integer> tal = new ArrayList<Integer>();
		tal.addAll(Arrays.asList(8, 56, 45, 34, 15, 12, 34, 44));

		System.out.println("expected 36, RESULT = " + maxReal(i));
		System.out.println("expected 10 Result = " + zeroCount(list));
		System.out.println(tal);
		// wauw så let når man bruger javas indbyggede funktioner
		Collections.sort(tal);
		System.out.println(tal);
	}

// ex 1
	public static int maxReal(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			return list.get(l);
		} else {
			int m = (l + h) / 2;
			int sum1 = maxReal(list, l, m);
			int sum2 = maxReal(list, m + 1, h);
			return sum1 + sum2;
		}
	}

	public static int maxReal(ArrayList<Integer> list) {
		return maxReal(list, 0, list.size() - 1);
	}

// ex 2
	public static int zeroCount(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			return list.get(l) == 0 ? 1 : 0;
		} else {
			int m = (l + h) / 2;
			int count = zeroCount(list, l, m);
			count += zeroCount(list, m + 1, h);
			return count;
		}
	}

	public static int zeroCount(ArrayList<Integer> list) {
		return zeroCount(list, 0, list.size() - 1);
	}

	public int max(ArrayList<Integer> list) {
		return maximum(list, 0, list.size() - 1);
	}

// ex 3
	private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
		// <flet list[low..middle] og list[middle+1..high] over i
		// en ny liste(temp)ved en total fletning>
		// <list[low..high] = temp>

		int n1 = middle - low + 1;
		int n2 = high - middle;

		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();
		temp.add(n1);
		temp2.add(n2);

	}

	// mergesort
	private static void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	public static void mergesort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// eksempel
	private int maximum(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			return list.get(l);
		} else {
			int m = (l + h) / 2;
			int max1 = maximum(list, l, m);
			int max2 = maximum(list, m + 1, h);
			if (max1 > max2) {
				return max1;
			} else {
				return max2;
			}
		}
	}

	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

// quicksort
	private void swap(ArrayList<Integer> list, int k, int l) {
		Integer e = list.get(k);
		list.set(k, list.get(l));
		list.set(l, e);
	}

	private void quicksort(ArrayList<Integer> list, int low, int high) {
		if (low < high) {
			int p = partition(list, low, high);
			quicksort(list, low, p - 1);
			quicksort(list, p + 1, high);
		}
	}

	private int partition(ArrayList<Integer> list, int low, int high) {
		int e = list.get(low);
		int i = low + 1;
		int j = high;
		while (i <= j) {
			if (list.get(i) <= e) {
				i++;
			} else if (list.get(j) > e) {
				j--;
			} else {
				swap(list, i, j);
				i++;
				j--;
			}
		}
		swap(list, low, j);
		return j;
	}

	public void quicksort(ArrayList<Integer> list) {
		quicksort(list, 0, list.size() - 1);
	}
}
