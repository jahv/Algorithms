package algorithms.edition4th.sort;

import java.util.Arrays;

import algorithms.edition4th.sort.utils.ArrayUtils;

public class BubbleSort<T> {

	public static <T> void sort(final Comparable<T>[] array) {
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				System.out.println("Step: [" + i + "," + j + "]");
				if(ArrayUtils.high(array[j], array[j+1])) {
					System.out.println("\tChange " + array[j] + " <-> " + array[j+1]);
					ArrayUtils.exch(array, j, j+1);
					System.out.println("\t" + Arrays.toString(array));
				}
			}
		}
	}

}
