package com.cqupt.algorithm.basic;

import com.cqupt.dataStructure.model.Node;

/**
 * 
 * Title: LinkedStack.java    
 * @description:链栈
 * @author liucx       
 * @created 2015年7月5日 下午3:42:02
 */
public class LinkedStack<T> {
	private Node<T> top;

	public LinkedStack(Node<T> top) {
		this.top = top;
	}

	public void push(Node<T> x) {
		Node<T> tmp = top.getNext();
		x.setNext(tmp);
		top.setNext(x);
	}

	public T pop() {
		Node<T> tmp = top;
		T data = tmp.getData();
		top = top.getNext();
		tmp = null;
		return data;
	}

	public T getTop() {
		return top.getData();
	}

	public int empty() {
		return top == null ? 1 : 0;
	}
}
