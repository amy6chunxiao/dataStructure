package com.cqupt.algorithm.sort;

@SuppressWarnings("rawtypes")
public class SelectionSort<T extends Comparable> implements Sort<T> {

	@Override
	public void sort(T[] array, int num) {
		for (int i = 0; i < num; i++) {
			int index = getMinPointIndex(array, i, num - 1);
			SortUtil.swap(array, index, i);
		}
	}
	/**
	 * 
	 * @description 获取无序区最小记录
	 * @author liucx
	 * @created 2015-6-16 下午9:50:13
	 * @param array
	 *            所有记录
	 * @param pBegin
	 *            无序区起始点
	 * @param pEnd
	 *            无序区终止点
	 * @return 最小记录的序号
	 */
	@SuppressWarnings("unchecked")
	public int getMinPointIndex(T[] array, int pBegin, int pEnd) {
		T minVlue = array[pBegin];
		int index = pBegin;
		while (pBegin <= pEnd) {
			if (array[pBegin].compareTo(minVlue) < 0) {
				minVlue = array[pBegin];
				index = pBegin;
			}
			pBegin++;
		}
		return index;
	}

}
