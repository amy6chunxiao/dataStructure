package com.cqupt.algorithm.basic;

public class Stack<T> {
	private T data[];
	private int size;
	int top;

	public Stack(T[] data) {
		this.data = data;
		this.size = data.length;
		this.top = -1;
	}

	public void push(T x) throws Exception {
		if (top + 1 >= size)
			throw new Exception("上溢");
		data[++top] = x;
	}

	public T pop() throws Exception {
		if (top == -1)
			throw new Exception("下溢");
		return data[top--];
	}

	public T getTop() {
		return top == -1 ? null : data[top--];
	}

	public int empty() {
		return top == -1 ? 1 : 0;
	}
}
