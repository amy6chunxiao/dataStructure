package com.cqupt.dataStructure.model;

public class HuffmanTreeNode {
	private int weight;
	private int lchild;
	private int rchild;
	private int parent;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLchild() {
		return lchild;
	}

	public void setLchild(int lchild) {
		this.lchild = lchild;
	}

	public int getRchild() {
		return rchild;
	}

	public void setRchild(int rchild) {
		this.rchild = rchild;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lchild;
		result = prime * result + parent;
		result = prime * result + rchild;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HuffmanTreeNode other = (HuffmanTreeNode) obj;
		if (lchild != other.lchild)
			return false;
		if (parent != other.parent)
			return false;
		if (rchild != other.rchild)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HuffmanTreeNode [weight=" + weight + ", lchild=" + lchild
				+ ", rchild=" + rchild + ", parent=" + parent + "]";
	}
}
