package com.cqupt.algorithm.sort;

/**
 * 
 * Title: InsertSort.java
 * 
 * @description:插入排序，类似于扑克牌排序
 * @author liucx
 * @created 2015-6-16 下午9:27:58
 */
public class InsertSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(T[] array, int num) {
		for (int i = 1; i < num; i++) {
			int j = i - 1;
			T key = array[i];
			// 依次与有序组比较，并挪动有序组顺序
			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
	
}
