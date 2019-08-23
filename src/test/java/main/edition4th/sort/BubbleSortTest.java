package algorithms.edition4th.sort;

import org.junit.Assert;
import org.junit.Test;

import algorithms.edition4th.sort.BubbleSort;

public class BubbleSortTest {
	
	@Test
	public void testSort() {
		final Integer[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		final Integer[] actual = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		BubbleSort.sort(actual);
		
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
		
	}

}
