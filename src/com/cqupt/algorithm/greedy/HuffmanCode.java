package com.cqupt.algorithm.greedy;

import java.util.List;

import com.cqupt.dataStructure.model.HuffmanTreeNode;

public class HuffmanCode {
	public void bulidHuffmanTree(List<HuffmanTreeNode> nodes) {
		while (nodes.size() > 0) {
			HuffmanTreeNode first = nodes.get(0);
			HuffmanTreeNode second = nodes.get(1);

			HuffmanTreeNode newNode = new HuffmanTreeNode();
			newNode.setWeight(first.getWeight() + second.getWeight());
			nodes.add(newNode);
			nodes.remove(0);
			nodes.remove(1);
		}
	}
}
