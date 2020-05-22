package com.ezycoding.problemsolving.leetcode;

import java.util.Arrays;
import java.util.List;

public class ConcatStrUniqChar {

	public static int maxLengthRecursive(List<String> arr) {
		int[] result = new int[1];
		maxUnique("#1",arr, 0, "", result);
		return result[0];
	}

	public static void maxUnique(String sym, List<String> arr, int index, String current, int[] result) {
		System.out.println(sym+"::"+index+"::"+current+"::"+arr.size());
		if (index == arr.size() && uniqueCharCount(current) > result[0]) {
			result[0] = current.length();
			System.out.println("Result::"+result[0]);
			return;
		}
		if (index == arr.size()) {
			return;
		}
		maxUnique("#2",arr, index + 1, current, result);
		System.out.println("=======");
		maxUnique("#3",arr, index + 1, current + arr.get(index), result);
	}

	public static int uniqueCharCount(String s) {
		int length = -1;
		int distinctLen = (int) (s.chars().distinct().count());
		if (s.length() == distinctLen) {
			length = distinctLen;
		}
		return length;
	}

	public static void main(String[] args) {
		String[] arr = new String[] { "a", "b", "c", "d" };
		System.out.println(maxLengthRecursive(Arrays.asList(arr)));
	}
}
