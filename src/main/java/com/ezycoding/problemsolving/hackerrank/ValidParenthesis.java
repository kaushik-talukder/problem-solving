package com.ezycoding.problemsolving.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

	1. Open brackets must be closed by the same type of brackets.
	2. Open brackets must be closed in the correct order.
	3. Note that an empty string is also considered valid.

*/

public class ValidParenthesis {
	
	public static boolean isValidParenthesis(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (map.containsKey(c)) {
				stack.push(c);
			} else {
				if (!stack.isEmpty() && map.get(stack.peek()) != null && map.get(stack.peek()) == c) {
					stack.pop();
				} else {
					stack.push('#');
					break;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValidParenthesis("(){}"));
	}
}
