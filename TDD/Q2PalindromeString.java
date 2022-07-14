package com.yash.tdd;

public class Q2PalindromeString {

	public static boolean StringPalindrome(String a) {
		String b = "";
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		if (StringPalindrome("niti")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
