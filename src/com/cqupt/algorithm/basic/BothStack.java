package com.cqupt.algorithm.basic;

import java.util.EmptyStackException;

/**
 * 
 * Title: BothStack.java
 * 
 * @description:两栈共享空间
 * @author liucx
 * @created 2015年7月5日 下午2:52:59
 */
public class BothStack<T> {
	private T data[];
	private int size;
	private int top1, top2;

	public BothStack(T[] data) {
		this.data = data;
		this.size = data.length;
		this.top1 = -1;
		this.top2 = size;
	}

	/**
	 * 
	 * @description 
	 * @author liucx
	 * @created 2015年7月5日 下午2:50:27
	 * @param i
	 *            表示对栈1还是栈2操作
	 * @param x
	 * @throws Exception
	 */
	public void push(int i, T x) throws Exception {

		if (top2 - top1 == 1)
			throw new Exception("栈空间已满");
		if (i == 1) {
			data[++top1] = x;
		} else if (i == 2) {
			data[--top2] = x;
		}
	}

	public T pop(int i) throws Exception {
		if (i == 1 && top1 >= 0)
			return data[top1--];
		else if (i == 2 && top2 < size)
			return data[top2--];
		else
			throw new Exception("栈空");
	}

	public T getPop(int i) throws Exception {
		if (i == 1 && top1 >= 0)
			return data[top1];
		else if (i == 2 && top2 < size)
			return data[top2];
		else
			throw new Exception("栈空");
	}

	public int empty(int i) {
		if (top1 == -1 && top2 == size)
			return 1;
		else
			return 0;
	}
}
