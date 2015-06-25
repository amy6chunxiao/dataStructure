package com.cqupt.dataStructure.tree;

import com.cqupt.dataStructure.model.BinaryTreeNode;

public abstract class BinaryTree<T> {
	protected BinaryTreeNode<T> root;

	public BinaryTree(BinaryTreeNode<T> root) {
		this.root = root;
	}

	public void preOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			System.out.println(root.getData());
			preOrder(root.getLeftChild());
			preOrder(root.getRightChild());
		}
	}

	public void inOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			inOrder(root.getLeftChild());
			System.out.println(root.getData());
			inOrder(root.getRightChild());
		}
	}

	public void postOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			postOrder(root.getLeftChild());
			postOrder(root.getRightChild());
			System.out.println(root.getData());
		}
	}

	public int getLength(BinaryTreeNode<T> root) {
		if (root == null)
			return 0;
		else {
			int ldepth = getLength(root.getLeftChild());
			int rdepth = getLength(root.getRightChild());
			return Math.max(ldepth, rdepth) + 1;
		}
	}

	public abstract BinaryTreeNode<T> getMinValue(BinaryTreeNode<T> root);

	public abstract BinaryTreeNode<T> getMaxValue(BinaryTreeNode<T> root);

	public abstract BinaryTreeNode<T> find(T k, boolean isIterative);

	public abstract void insert(BinaryTreeNode<T> root, BinaryTreeNode<T> node);

	public abstract void delete(BinaryTreeNode<T> node);

}
