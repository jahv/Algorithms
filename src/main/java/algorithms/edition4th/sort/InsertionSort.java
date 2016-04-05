package algorithms.edition4th.sort;

import algorithms.edition4th.sort.utils.ArrayUtils;

/**
 * Insertion sort algorithm
 * 
 * @author jose.hernandez
 *
 * @param <T>
 */
public class InsertionSort<T> {

	public static <T> void sort(final Comparable<T>[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && ArrayUtils.less(array[j], array[j - 1]); j--) {
				ArrayUtils.exch(array, j, j - 1);
			}
		}
	}

}
