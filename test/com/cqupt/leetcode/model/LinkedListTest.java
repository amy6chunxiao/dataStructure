package com.cqupt.leetcode.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	LinkedList linkedList;
	ListNode node0;

	@Before
	public void setUp() throws Exception {
		linkedList = new LinkedList();
		node0 = new ListNode(2);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(2);

		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
	}

	@Test
	public void testRemoveElements() {
		ListNode node=linkedList.removeElements(node0, 2);
		assertEquals(3, node.val);
		assertEquals(1, node.next.val);
	}

}
