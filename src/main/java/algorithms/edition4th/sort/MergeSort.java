package algorithms.edition4th.sort;

import algorithms.edition4th.sort.utils.ArrayUtils;

public class MergeSort<T> {

	public static <T> void sortTopDown(final Comparable<T>[] array) {
//		topDownSplitMerge(array, 0, array.length);
	}
	
	public static <T> void topDownSplitMerge(final Comparable<T>[] array, final int begin, final int end, 
			final Comparable<T>[] workArray) {
		if(end - begin < 2) {
			return;
		}
		
		final int mid = (end - begin) / 2;
		topDownSplitMerge(array, begin, mid, workArray);
		topDownSplitMerge(array, mid, end, workArray);
		topDownMerge(array, begin, mid, end, workArray);
		copyArray(workArray, begin, end, array);
	}
	
	public static <T> void topDownMerge(final Comparable<T>[] array, final int begin, final int mid, 
			final int end, final Comparable<T>[] workArray) {
		int b = begin;
		int m = mid;
		
		for(int i = begin; i < end; i++) {
			if(b < mid && (m >= end || ArrayUtils.less(array[b], array[m]))) {
				workArray[i] = array[b];
				b++;
			} else {
				workArray[i] = array[m];
				m++;
			}
		}
	}
	
	public static <T> void copyArray(final Comparable<T>[] B, final int begin, final int end, 
			final Comparable<T>[] A) {
		for(int i = begin; i < end; i++) {
			A[i] = B[i];
		}
	}
	
	
	//########
	
	
	private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public void sortt(String a[]) {
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
