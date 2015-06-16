package com.cqupt.algorithm.sort;

/**
 * 
 * Title: QuickSort.java
 * 
 * @description:快排算法
 * @author liucx
 * @created 2015-6-16 下午4:46:32
 */
public class QuickSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(T[] array, int num) {
		sort(array, 0, num - 1);
	}
	/**
	 * 
	 * @description 递归式的划分为若干子序列，并对子序列排序
	 * @author liucx
	 * @created 2015-6-15 下午7:34:50
	 * @param array
	 *            待划分子序列
	 * @param pBegin
	 *            待划分区间最左侧记录
	 * @param pEnd
	 *            待划分区间最右侧记录
	 */
	public void sort(T[] array, int pBegin, int pEnd) {
		if (pBegin < pEnd) {
			int pivot = partition(array, pBegin, pEnd);
			sort(array, pBegin, pivot - 1);
			sort(array, pivot + 1, pEnd);
		}
	}

	/**
	 * 
	 * @description 一次划分过程
	 * @author liucx
	 * @created 2015-6-15 下午7:34:32
	 * @param r
	 *            待划分子序列
	 * @param pBegin
	 *            待划分区间最左侧记录
	 * @param pEnd
	 *            待划分区间最右侧记录
	 * @return 轴值位置
	 */
	public int partition(T[] r, int pBegin, int pEnd) {
		int i = pBegin, j = pEnd;
		while (i < j) {
			while (i < j && r[i].compareTo(r[j]) <= 0)
				j--;
			if (i < j) {
				SortUtil.swap(r, i, j);
				i++;
			}
			while (i < j && r[i].compareTo(r[j]) <= 0) {
				i++;
			}
			if (i < j) {
				SortUtil.swap(r, i, j);
				j--;
			}
		}
		return i;
	}
}
