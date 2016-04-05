package algorithms.edition4th.sort.utils;

import org.junit.Assert;
import org.junit.Test;

import algorithms.edition4th.sort.utils.ArrayUtils;

/**
 * 
 * @author jose.hernandez
 *
 */
public class ArrayUtilsTest {

	/**
	 * Testing exchange method
	 */
	@Test
	public void testExchMethod() {
		final Integer[] expected = { 2, 1 };
		
		final Integer[] actual = { 1, 2 };
		ArrayUtils.exch(expected, 0, 1);

		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	/**
	 * Testing less method when value is less
	 */
	@Test
	public void testLessMethod_LessThan() {
		final Boolean expected = true;
		final Boolean actual = ArrayUtils.less(1, 2);
		Assert.assertEquals(expected, actual);
		
	}
	
	/**
	 * Testing less method when value is higher or equals
	 */
	@Test
	public void testLessMethod_HighThan() {
		final Boolean expected = false;
		
		Boolean actual = ArrayUtils.less(2, 1);
		Assert.assertEquals(expected, actual);
		
		actual = ArrayUtils.less(1, 1);
		Assert.assertEquals(expected, actual);
	}
	
}
