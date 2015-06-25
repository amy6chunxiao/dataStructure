package com.cqupt.dataStructure.model;

/**
 * 
 * Title: BinaryTreeNode.java
 * 
 * @description:二叉树节点
 * @author liucx
 * @created 2015年6月19日 下午9:10:17
 */
public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> leftChild;
	BinaryTreeNode<T> rightChild;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [data=" + data + ", leftChild=" + leftChild
				+ ", rightChild=" + rightChild + "]";
	}

}
