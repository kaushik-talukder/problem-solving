package com.ezycoding.problemsolving.leetcode;

import org.apache.commons.lang3.StringUtils;

public class LongestPalindrome {
    private static final String DEFAULT_WORD = "babad";

    public static void main(String[] args) {
        if (args.length > 0 && StringUtils.isNotBlank(args[0])) {
            longestPalindrome(args[0]);
        } else {
            longestPalindrome(DEFAULT_WORD);
        }
    }

    private static void longestPalindrome(String word) {
        int maxPalindromeCharCount = 0;
        String maxPalindrome = null;
        for (int i = 0; i <= word.length() - 1; i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String subWord = word.substring(i, j);
                if (isPalindrome(subWord) && subWord.length() > maxPalindromeCharCount) {
                    maxPalindromeCharCount = subWord.length();
                    maxPalindrome = subWord;
                }
            }
        }
        System.out.println("Max palindrome: " + maxPalindrome);
    }

    private static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
