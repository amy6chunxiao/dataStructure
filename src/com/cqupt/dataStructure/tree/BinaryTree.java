package com.cqupt.dataStructure.tree;

import com.cqupt.dataStructure.model.BinaryTreeNode;

public abstract class BinaryTree<T> {
	protected BinaryTreeNode<T> root;

	public BinaryTree(BinaryTreeNode<T> root) {
		this.root = root;
	}

	public void preOrder() {
		preOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder() {
		postOrder(root);
	}

	protected void preOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			System.out.println(root.getData());
			preOrder(root.getLeftChild());
			preOrder(root.getRightChild());
		}
	}

	protected void inOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			inOrder(root.getLeftChild());
			System.out.println(root.getData());
			inOrder(root.getRightChild());
		}
	}

	protected void postOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			postOrder(root.getLeftChild());
			postOrder(root.getRightChild());
			System.out.println(root.getData());
		}
	}

}
