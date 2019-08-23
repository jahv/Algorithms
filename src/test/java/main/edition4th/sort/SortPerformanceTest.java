package algorithms.edition4th.sort;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import algorithms.edition4th.sort.Sort;

/**
 * Test class for verify the timing for algorithms
 * 
 * @author jose.hernandez
 *
 */
public class SortPerformanceTest {

	private static final Integer[] original = generateArray(50);
	private Integer[] actual;
	private Long start;
	private Long end;

	@Before
	public void beforeTest() {
		System.out.println("_________");
		actual = original.clone();
		System.out.println("Data: " + Arrays.toString(actual));
	}
	
	@After
	public void afterTest() {
		System.out.println(Arrays.toString(actual));
		System.out.println("Execution in: " + (end - start) + " milliseconds.");
	}
	
	/**
	 * 
	 */
	@Test
	public void testPerformance_BubbleSort() {
		System.out.println("BUBBLE SORT");
		
		start = System.currentTimeMillis();
		Sort.bubbleSort(actual);
		end = System.currentTimeMillis();
	}
	
	/**
	 * 
	 */
	@Test
	public void testPerformance_SelectionSort() {
		System.out.println("SELECTION SORT");
		
		start = System.currentTimeMillis();
		Sort.selectionSort(actual);
		end = System.currentTimeMillis();
	}
	
	/**
	 * 
	 */
	@Test
	public void testPerformance_InsertionSort() {
		System.out.println("INSERTION SORT");
		
		start = System.currentTimeMillis();
		Sort.insertionSort(actual);
		end = System.currentTimeMillis();
	}
	
	/**
	 * 
	 */
	@Test
	public void testPerformance_ShellSort() {
		System.out.println("SHELL SORT");
		
		start = System.currentTimeMillis();
		Sort.shellSort(actual);
		end = System.currentTimeMillis();
	}

	/**
	 * Generate mock array of size equals to n.
	 * Interval for data entries is [0,100)
	 * 
	 * @param n
	 * @return
	 */
	private static Integer[] generateArray(int n) {
		final Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}
}
