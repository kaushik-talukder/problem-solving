package com.ezycoding.problemsolving.others;

import java.util.LinkedHashMap;

class LRUCacheMap {

	private LinkedHashMap<Integer, Integer> cache;
	private int N;

	public LRUCacheMap(int capacity) {
		this.N = capacity;
		this.cache = new LinkedHashMap<Integer, Integer>();
	}

	public int get(int key) {
		int result = -1;

		if (this.cache.containsKey(key)) {
			result = this.cache.get(key);
			this.cache.remove(key);
			this.cache.put(key, result);
		}

		return result;
	}

	public void put(int key, int value) {
		if (this.cache.containsKey(key)) {
			this.cache.remove(key);
		} else {
			if (this.cache.size() == N) {
				Integer firstKey = this.cache.keySet().iterator().next();
				this.cache.remove(firstKey);
			}
		}

		this.cache.put(key, value);
	}

	public void print() {
		System.out.println(cache);
	}
}

public class LRUUsingMap {
	public static void main(String[] args) {
		LRUCacheMap cache = new LRUCacheMap(2);
		cache.put(1, 1);
		cache.print();
		cache.put(2, 2);
		cache.print();
		System.out.println(cache.get(1)); // returns 1
		cache.print();
		cache.put(3, 3); // evicts key 2
		cache.print();
		System.out.println(cache.get(2)); // returns -1 (not found)
		cache.put(4, 4); // evicts key 1
		cache.print();
		System.out.println(cache.get(1)); // returns -1 (not found)
		System.out.println(cache.get(3)); // returns 3
		System.out.println(cache.get(4)); // returns 4
	}
}
