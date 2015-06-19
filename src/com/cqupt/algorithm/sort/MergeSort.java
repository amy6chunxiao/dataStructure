package com.cqupt.algorithm.sort;

@SuppressWarnings("rawtypes")
public class MergeSort<T extends Comparable> implements Sort<T> {

	@Override
	public void sort(T[] array, int num) {
		T[] array2 = array.clone();
		for (int i = 0; i < num; i++) {
			array2[i] = null;
		}
		mergeSort(array, array2, 0, num - 1);
	}

	public void mergeSort(T[] array1, T[] array2, int pBegin, int pEnd) {
		if (pBegin == pEnd) {
			array2[pBegin] = array1[pBegin];
		} else {
			int boundary = (pBegin + pEnd) / 2;
			mergeSort(array1, array2, pBegin, boundary);
			mergeSort(array1, array2, boundary + 1, pEnd);

			System.out.println("pBegin=" + pBegin + ",pEnd=" + pEnd);
			merge(array1, array2, pBegin, boundary, pEnd);
		}
	}

	/**
	 * 
	 * @param array1
	 * @param array2
	 * @param pBegin
	 * @param boundary
	 * @param pEnd
	 */
	@SuppressWarnings("unchecked")
	public void merge(T[] array1, T[] array2, int pBegin, int boundary, int pEnd) {
		int pointer = pBegin, i = pBegin, j = boundary + 1;
		while (i <= boundary && j <= pEnd) {
			if (array1[i].compareTo(array1[j]) <= 0)
				array2[pointer++] = array1[i++];
			else
				array2[pointer++] = array1[j++];
		}
		while (i <= boundary) {
			array2[pointer++] = array1[i++];
		}
		while (j <= pEnd) {
			array2[pointer++] = array1[j++];
		}

		for (T d : array2) {
			System.out.print(d + " ");
		}
		System.out.println("一次归并完成***********");
	}

	public static void main(String[] args) {
		MergeSort<Double> s = new MergeSort<Double>();
		Double[] array = { 2.0, 4.0, 2.0, 5.0, 9.0, 12.0, 3.0, 10.0, 1.0, 1.0 };
		Double[] array2 = new Double[array.length];
		s.mergeSort(array, array2, 0, array.length - 1);

		System.out.println("排序完成：");
		for (double d : array2) {
			System.out.print(d + " ");
		}
	}
}
