package com.ezycoding.problemsolving.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*

Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

*/

public class Anagram {

	// Using 2 maps
	boolean checkAnagram1(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		int len = a.length();

		for (int i = 0; i < len; i++) {
			if (map1.containsKey(a.charAt(i))) {
				map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
			} else {
				map1.put(a.charAt(i), 1);
			}

			if (map2.containsKey(b.charAt(i))) {
				map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
			} else {
				map2.put(b.charAt(i), 1);
			}
		}

		return map1.equals(map2);
	}

	// Using sort
	boolean checkAnagram2(String a, String b) {
		char[] cha = a.toCharArray();
		char[] chb = b.toCharArray();

		Arrays.sort(cha);
		Arrays.sort(chb);

		String sta = new String(cha);
		String stb = new String(chb);

		return sta.equals(stb);

	}

	// Using Java 8 feature
	boolean checkAnagram3(String a, String b) {
		List<String> l1 = Arrays.asList(a.split(""));
		List<String> l2 = Arrays.asList(b.split(""));
		Map<String, Long> map1 = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> map2 = l2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return map1.equals(map2);
	}

	// Using 1 map
	boolean checkAnagram4(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();

		int len = a.length();

		for (int i = 0; i < len; i++) {
			if (map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			} else {
				map.put(a.charAt(i), 1);
			}

			if (map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
			} else {
				map.put(b.charAt(i), -1);
			}
		}

		boolean flag = true;

		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() != 0) {
				flag = false;
				break;
			}
		}
		// System.out.println(map);
		return flag;
	}

	public static void main(String[] args) {
		Anagram obj = new Anagram();
		System.out.println(obj.checkAnagram4("fff", "rrr"));
	}
}