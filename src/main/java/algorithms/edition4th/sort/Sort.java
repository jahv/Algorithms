package algorithms.edition4th.sort;

public class Sort<T> {
	
	public static <T> void bubbleSort(final Comparable<T>[] array) {
		BubbleSort.sort(array);
	}

	public static <T> void insertionSort(final Comparable<T>[] array) {
		InsertionSort.sort(array);
	}
	
	public static <T> void selectionSort(final Comparable<T>[] array) {
		SelectionSort.sort(array);
	}
	
	public static <T> void shellSort(final Comparable<T>[] array) {
		ShellSort.sort(array);
	}
}
