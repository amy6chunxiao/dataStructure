package com.cqupt.algorithm.basic;

public class SeqList<T> {
	private T[] data;
	private int size;

	public SeqList(T[] data) {
		this.data = data;
		this.size = data.length;
	}

	public int length() {
		return size;
	}

	public T get(int i) throws Exception {
		if (i >= size)
			throw new Exception("数组下标越界");
		return data[i];
	}

	public int locate(T x) {
		for (int i = 0; i < size; i++) {
			if (x.equals(data[i]))
				return i + 1;
		}
		return -1;
	}

	public void insert(int i, T x) {
//		if()
	}

	public T delete(int i) throws Exception {
		if (i >= size)
			throw new Exception("数组越界");
		T x = data[i - 1];
		for (int j = i; j < size; j++) {
			data[j - 1] = data[j];
		}
		size--;
		return x;
	}

	public void printList() {
		for (T tmp : data) {
			System.out.println(tmp);
		}
	}
}
