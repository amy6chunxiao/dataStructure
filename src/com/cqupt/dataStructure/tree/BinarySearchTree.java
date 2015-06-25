package com.cqupt.dataStructure.tree;

import com.cqupt.dataStructure.model.BinaryTreeNode;

/**
 * 
 * Title: BinarySearchTree.java
 * 
 * @description:二叉搜索树
 * @author liucx
 * @created 2015年6月19日 下午11:43:31
 */
@SuppressWarnings("rawtypes")
public class BinarySearchTree<T extends Comparable> extends BinaryTree<T> {

	public BinarySearchTree(BinaryTreeNode<T> root) {
		super(root);
	}

	@Override
	public BinaryTreeNode<T> getMaxValue(BinaryTreeNode<T> x) {
		while (x.getRightChild() != null) {
			x = x.getRightChild();
		}
		return x;
	}

	@Override
	public BinaryTreeNode<T> getMinValue(BinaryTreeNode<T> x) {
		while (x.getLeftChild() != null) {
			x = x.getLeftChild();
		}
		return x;
	}

	@Override
	public BinaryTreeNode<T> find(T k, boolean isIterative) {
		return isIterative ? iterativeFind(root, k) : find(root, k);
	}

	@SuppressWarnings("unchecked")
	protected BinaryTreeNode<T> find(BinaryTreeNode<T> x, T k) {
		if (x.getData().equals(k))
			return x;
		if (k.compareTo(x.getData()) < 0)
			return find(x.getLeftChild(), k);
		else
			return find(x.getRightChild(), k);
	}

	@SuppressWarnings("unchecked")
	protected BinaryTreeNode<T> iterativeFind(BinaryTreeNode<T> x, T k) {
		while (x != null && k != x.getData()) {
			if (k.compareTo(x.getData()) < 0)
				x = x.getLeftChild();
			else
				x = x.getRightChild();
		}
		return x;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void insert(BinaryTreeNode<T> root, BinaryTreeNode<T> node) {
		BinaryTreeNode<T> pointer = null, x = root;
		while (x != null) {
			pointer = x;
			if (node.getData().compareTo(x.getData()) < 0)
				x = x.getLeftChild();
			else
				x = x.getRightChild();
		}
		if (pointer == null)
			root = node;
		else if (node.getData().compareTo(pointer.getData()) < 0)
			pointer.setLeftChild(node);
		else
			pointer.setRightChild(node);
	}

	@Override
	public void delete(BinaryTreeNode<T> node) {
		
	}

	private void transplant(BinaryTreeNode<T> node, BinaryTreeNode<T> u,
			BinaryTreeNode<T> v) {
		
	}

}
