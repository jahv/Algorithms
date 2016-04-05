package algorithms.edition4th.sort;

import algorithms.edition4th.sort.utils.ArrayUtils;

/**
 * Shell sort algorithm
 * 
 * @author jose.hernandez
 *
 * @param <T>
 */
public class ShellSort<T> {

	public static <T> void sort(final Comparable<T>[] array) {
		int N = array.length;
		int h = 1;

		while (h < N / 3) {
			h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
		}

		while (h >= 1) { // h-sort the array.
			for (int i = h; i < N; i++) { // Insert a[i] among a[i-h], a[i-2*h],
											// a[i-3*h]... .
				for (int j = i; j >= h && ArrayUtils.less(array[j], array[j - h]); j -= h) {
					ArrayUtils.exch(array, j, j - h);
				}
			}
			h = h / 3;
		}
	}
}
