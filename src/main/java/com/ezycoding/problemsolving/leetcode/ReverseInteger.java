package com.ezycoding.problemsolving.leetcode;

/*

Given a 32-bit signed integer, reverse digits of an integer.
Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 
*/

public class ReverseInteger {
	public static int reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int res = num % 10;
			num /= 10;
			if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && res > 7))
				return 0;
			if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && res < -8))
				return 0;
			reverse = reverse * 10 + res;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
