package com.cqupt.algorithm.sortTest;

import com.cqupt.algorithm.sort.SelectionSort;
import com.cqupt.algorithm.sort.Sort;

public class SelectionSortTest {
	public static void main(String[] args) {
		Sort<Double> selectionSort = new SelectionSort<Double>();
		Double[] array = {2.0, 4.0, 2.0, 5.0, 9.0, 12.0, 3.0, 10.0, 1.0, 1.0};
		selectionSort.sort(array, array.length);

		System.out.println("排序完成：");
		for (double d : array) {
			System.out.print(d + " ");
		}
	}
}
