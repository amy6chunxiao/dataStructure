package com.cqupt.algorithm.sort;

import java.lang.reflect.Array;

@SuppressWarnings("rawtypes")
public class MergeSort<T extends Comparable> implements Sort<T> {

	@Override
	public void sort(T[] array, int num) {

		T[] array2 = (T[]) Array.newInstance(array.getClass(), num);
		mergeSort(array, array2, 0, num - 1);
	}

	public void mergeSort(T[] array1, T[] array2, int pBegin, int pEnd) {
		if (pBegin == pEnd) {
			return;
		} else {
			int boundary = (pBegin + pEnd) / 2;
			mergeSort(array1, array2, pBegin, boundary);
			mergeSort(array1, array2, boundary + 1, pEnd);
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
	public void merge(T[] array1, T[] array2, int pBegin, int boundary, int pEnd) {
		int pointer = pBegin, i = pBegin, j = boundary + 1;
		while (i <= boundary && j <= pEnd) {
			if (array1[i].compareTo(array1[j]) < 0)
				array2[pointer++] = array1[i++];
			else
				array2[pointer++] = array1[i++];
		}
		while (i <= boundary) {
			array2[pointer++] = array1[i++];
		}
		while (j <= pEnd) {
			array2[pointer++] = array1[j++];
		}
	}
}
