package com.cqupt.algorithm.sort;

/**
 * 
 * Title: HeapSort.java
 * 
 * @description:从后往前数，从第一个非叶子节点开始进行调整，必须满足父节点大于所有子节点，如果不满足，则进行交换.初始建堆完成后，依次交换第一个元素和叶子节点，然后调整堆
 * @author liucx
 * @created 2015-6-16 下午3:37:51
 */
public class HeapSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(T[] array, int num) {
		// 调整初始堆
		for (int i = num / 2; i >= 1; i--) {
			shift(array, i, num);
		}
		// 重复移走堆顶元素，并重建堆
		for (int i = 1; i <= num; i++) {
			SortUtil.swap(array, 0, num - i);
			shift(array, 1, num - i);
		}
	}
	/**
	 * 
	 * @description 一次调整堆的过程，从最后一个分支节点开始调整堆
	 * @author liucx
	 * @created 2015-6-16 下午4:48:43
	 * @param array
	 * @param k 
	 * @param m 
	 */
	public void shift(T[] array, int k, int m) {
		int i = k, j = k * 2;
		while (j <= m) {

			// 比较i的子节点，j指向较大者
			if (j < m && array[j - 1].compareTo(array[j]) < 0)
				j++;
			if (array[i - 1].compareTo(array[j - 1]) > 0)
				break;
			else {
				// 交换节点后，还需要调整被交换节点，看它是否满足大根堆/小根堆定义
				SortUtil.swap(array, i - 1, j - 1);
				i = j;
				j = i * 2;
			}
		}
	}

}
