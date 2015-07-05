package com.cqupt.algorithm.basic;

import com.cqupt.dataStructure.model.Node;

/**
 * 
 * Title: LinkedQueue.java
 * 
 * @description:链队列，注意front指针没存值
 * @author liucx
 * @created 2015年7月5日 下午4:55:18
 */
public class LinkedQueue<T> {
	private Node<T> front;
	private Node<T> rear;

	public LinkedQueue(Node<T> head) {
		this.front = head;
		this.rear = head;
	}

	public void enQueue(Node<T> x) {
		rear.setNext(x);
		rear = x;
	}

	public T deQueue() throws Exception {
		if (rear == front)
			throw new Exception("队列为空");
		Node<T> tmp = front.getNext();
		T data = tmp.getData();
		front = front.getNext();
		// 考虑只有一个元素的特殊情况
		if (tmp.getNext() == null)
			rear = front;
		tmp = null;
		return data;
	}

}
