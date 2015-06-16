package com.cqupt.leetcode.model;

public class LinkedList {
	public ListNode removeElements(ListNode head, int val) {

		ListNode tail = head, point = head;
		while (point != null && point.val == val) {
			ListNode tmp = point;
			point = tmp.next;
			tmp = null;
		}
		tail = point;
		while (point != null) {
			if (point.next != null && point.next.val == val) {
				ListNode nnext = point.next.next;
				point.next = nnext;
			} else {
				point = point.next;
			}
		}
		return tail;
	}
}
