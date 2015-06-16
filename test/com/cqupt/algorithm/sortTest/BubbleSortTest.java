package com.cqupt.algorithm.sortTest;

import com.cqupt.algorithm.sort.BubbleSort;
import com.cqupt.algorithm.sort.Sort;

public class BubbleSortTest {
	public static void main(String[] args) {
		Sort<Double> bubbleSort = new BubbleSort<Double>();
		Double[] array = {2.0, 4.0, 2.0, 5.0, 9.0, 12.0, 3.0, 10.0, 1.0, 1.0};
		bubbleSort.sort(array, array.length);

		System.out.println("排序完成：");
		for (double d : array) {
			System.out.print(d + " ");
		}
	}
}
