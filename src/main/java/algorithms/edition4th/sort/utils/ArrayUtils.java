package algorithms.edition4th.sort.utils;

/**
 * Class to perform common operations over arrays
 * 
 * @author jose.hernandez
 *
 * @param <T>
 */
public class ArrayUtils<T> {
	
	/**
	 * Verifies if first value is lower than second
	 * 
	 * @param first
	 * @param second
	 * @return true if is lower, otherwise false
	 */
	@SuppressWarnings("unchecked")
	public static <T> Boolean less(final Comparable<T> first, final Comparable<T> second) {
		if(first.compareTo((T) second) < 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Verifies if first value is higher than second
	 * 
	 * @param first
	 * @param second
	 * @return true if is higher, otherwise false
	 */
	@SuppressWarnings("unchecked")
	public static <T> Boolean high(final Comparable<T> first, final Comparable<T> second) {
		if(first.compareTo((T) second) >= 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Performs an exchange for element in position i by element in position j for array 
	 * @param array
	 * @param i
	 * @param j
	 */
	@SuppressWarnings("unchecked")
	public static <T> void exch(final Comparable<T>[] array, final int i, final int j) {
		final T jValue = (T) array[j];
		array[j] = array[i];
		array[i] = (Comparable<T>) jValue;
	}

}
