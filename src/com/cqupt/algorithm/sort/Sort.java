package com.cqupt.algorithm.sort;

public interface Sort<T> {
	/**
	 * 
	 * @description 排序算法需实现此接口，实现排序的具体业务逻辑
	 * @author liucx
	 * @created 2015-6-16 下午4:48:50
	 * @param array
	 *            待排序序列
	 * @param num
	 *            待排序序列长度
	 */
	public void sort(T[] array, int num);
}
