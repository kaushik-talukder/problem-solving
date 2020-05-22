package com.ezycoding.problemsolving.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class LFUCache {

	Map<Integer, Integer> map;
	int frameSize;

	public LFUCache(int frameSize) {
		this.map = new HashMap<>();
		this.frameSize = frameSize;
	}

	public void refer(int x) {
		int key = 0, minCount = Integer.MAX_VALUE;
		if (map.containsKey(x)) {
			map.put(x, map.get(x) + 1);
		} else {
			if (map.size() == frameSize) {
				for (Entry<Integer, Integer> e : map.entrySet()) {
					if (e.getValue() < minCount) {
						minCount = e.getValue();
						key = e.getKey();
					}
				}
				map.remove(key);
			}
			map.put(x, 1);
		}

	}

	public void print() {
		for (Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		System.out.println("=========");
	}
}

public class LFUCacheEx {

	public static void main(String[] args) {
		LFUCache c = new LFUCache(3);
		c.refer(1);
		c.refer(2);
		c.refer(3);
		c.print();
		c.refer(4);
		c.print();
		c.refer(3);
		c.print();
		c.refer(2);
		c.print();
		c.refer(5);
		c.print();
	}
}
