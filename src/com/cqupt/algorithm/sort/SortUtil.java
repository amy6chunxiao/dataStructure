package com.cqupt.algorithm.sort;

public class SortUtil {
	/**
	 * 
	 * @description 将i与j处的元素互换
	 * @author liucx
	 * @created 2015-6-15 下午7:36:08
	 * @param array
	 * @param i
	 * @param j
	 */
	public static void swap(Comparable<?>[] array, int i, int j) {
		Comparable<?> tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
