package com.ezycoding.problemsolving.leetcode;

public class SumStrings {
    public static void main(String[] args) {
        String num1 = "10000";
        String num2 = "999";
        System.out.println("Sum :: " + addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        int num1Len = num1.length() - 1;
        int num2Len = num2.length() - 1;
        int digit1 = 0;
        int digit2 = 0;
        int value = 0;
        int carry = 0;
        StringBuilder sum = new StringBuilder();
        while (num1Len >= 0 || num2Len >= 0) {
            digit1 = num1Len >= 0 ? num1.charAt(num1Len) - '0' : 0;
            digit2 = num2Len >= 0 ? num2.charAt(num2Len) - '0' : 0;
            value = (digit1 + digit2 + carry) % 10;
            carry = (digit1 + digit2 + carry) / 10;
            sum.append(value);
            num1Len--;
            num2Len--;
        }
        if (carry > 0) {
            sum.append(carry);
        }
        return sum.reverse().toString();
    }
}
