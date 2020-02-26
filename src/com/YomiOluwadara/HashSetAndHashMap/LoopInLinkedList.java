package com.YomiOluwadara.HashSetAndHashMap;

import java.util.HashSet;

public class LoopInLinkedList {
	static Node head; // head of list

	/* Linked list Node */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Returns true if there is a loop in linked
	// list else returns false.
	static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			// If we have already has this node
			// in hashmap it means their is a cycle
			// (Because you we encountering the
			// node second time).
			if (s.contains(h))
				return true;
			System.out.println("loop is in the linked list");

			// If we are seeing the node for
			// the first time, insert it in hash
			s.add(h);

			h = h.next;
		}
		System.out.println("loop is not in the linked list");
		return false;

	}

	public static void main(String[] args) {
		LoopInLinkedList obj = new LoopInLinkedList();
		obj.push(20);
	}

}
