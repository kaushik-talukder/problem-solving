package com.ezycoding.problemsolving.others;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

class LRUCache {
	Deque<Integer> q;
	int frameSize;

	public LRUCache(int frameSize) {
		this.frameSize = frameSize;
		this.q = new LinkedList<>();
	}

	public void refer(int x) {
		if (q.size() == frameSize) {
			if (q.contains(x)) {
				q.removeLastOccurrence(x);
			} else {
				q.remove();
			}
		}
		q.add(x);
	}

	public void print() {
		Iterator<Integer> i = q.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("============");
	}
}

public class LRUCacheEx {
	public static void main(String[] args) {
		LRUCache c = new LRUCache(3);
		c.refer(1);
		c.print();
		c.refer(2);
		c.print();
		c.refer(1);
		c.print();
		c.refer(1);
		c.print();

	}
}
