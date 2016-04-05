package algorithms.edition4th.sort;

import algorithms.edition4th.sort.utils.ArrayUtils;

/**
 * Selection sort algorithm
 * 
 * @author jose.hernandez
 *
 * @param <T>
 */
public class SelectionSort<T> {
	
	/**
	 * 
	 * @param array
	 */
	public static <T> void sort(final Comparable<T>[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = minIndex; j < array.length; j++) {
				if (ArrayUtils.less(array[j], array[minIndex])) {
					ArrayUtils.exch(array, i, j);
				}
			}
		}
	}
	

}
