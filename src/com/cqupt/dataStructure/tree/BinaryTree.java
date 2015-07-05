package com.cqupt.dataStructure.tree;

import com.cqupt.dataStructure.model.BinaryTreeNode;

public abstract class BinaryTree<T> {
	protected BinaryTreeNode<T> root;

	public BinaryTree(BinaryTreeNode<T> root) {
		this.root = root;
	}

	public void preOrder(BinaryTreeNode<T> root, BinaryTreeNode<T>[] stack) {
		int top = -1;
		while (root != null || top != -1) {
			while (root != null) {
				System.out.println(root.getData());
				stack[++top] = root;
				root = root.getLeftChild();
			}

			if (top != -1) {
				BinaryTreeNode<T> p = stack[top--];
				root = p.getRightChild();
			}
		}
	}

	public void iterativePreOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			System.out.println(root.getData());
			iterativePreOrder(root.getLeftChild());
			iterativePreOrder(root.getRightChild());
		}
	}

	public void inOrder(BinaryTreeNode<T> root, BinaryTreeNode<T>[] stack) {
		int top = -1;
		while (root != null || top != -1) {
			while (root != null) {
				stack[++top] = root;
				root = root.getLeftChild();
			}
			if (top != -1) {
				root = stack[top--];
				System.out.println(root);
				root = root.getRightChild();
			}
		}
	}

	public void iterativeInOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			iterativeInOrder(root.getLeftChild());
			System.out.println(root.getData());
			iterativeInOrder(root.getRightChild());
		}
	}

	public void postOrder(BinaryTreeNode<T> root, BinaryTreeNode<T>[] stack) {
		
	}

	public void iterativePostOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		else {
			iterativePostOrder(root.getLeftChild());
			iterativePostOrder(root.getRightChild());
			System.out.println(root.getData());
		}
	}

	public void levelOrder(BinaryTreeNode<T> root) {
		if (root == null)
			return;
		// BinaryTree<T> []queue=new BinaryTree<T>[];
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
