package com.cqupt.algorithm.sort;

import java.util.logging.Logger;

/**
 * 
 * Title: BubbleSort.java
 * 
 * @description 冒泡排序算法
 * @author liucx
 * @created 2015-6-16 下午5:22:50
 */
public class BubbleSort<T extends Comparable<? super T>> implements Sort<T> {
	
	@Override
	public void sort(T[] array, int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i].compareTo(array[j]) < 0) {
					SortUtil.swap(array, i, j);
				}
			}
		}
	}
}
