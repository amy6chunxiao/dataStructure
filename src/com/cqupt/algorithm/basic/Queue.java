package com.cqupt.algorithm.basic;

/**
 * 
 * Title: Queue.java
 * 
 * @description:循环队列,注意对头指针front不要赋值（才可区分栈满和栈空）
 * @author liucx
 * @created 2015年7月5日 下午3:49:29
 */
public class Queue<T> {
	private T[] data;
	private int size;
	private int front, rear;

	public Queue(T[] data) {
		this.data = data;
		this.size = data.length;
		this.front = size - 1;
		this.rear = size - 1;
	}

	public void enQueue(T x) throws Exception {
		if ((rear + 1) % size == front)
			throw new Exception("循环队列已满");
		rear = (rear + 1) % size;
		data[rear] = x;
	}

	public T deQueue() throws Exception {
		if (rear == front)
			throw new Exception("队列为空");
		front = (front + 1) % size;
		return data[front];
	}

	public T getQueue() throws Exception {
		if (rear == front)
			throw new Exception("队列为空");
		int i = (front + 1) % size;
		return data[i];
	}

	public int empty() {
		return front == rear ? 1 : 0;
	}
}
