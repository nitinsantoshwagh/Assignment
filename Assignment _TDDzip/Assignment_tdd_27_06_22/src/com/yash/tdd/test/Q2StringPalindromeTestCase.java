package com.yash.tdd.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q2PalindromeString;


public class Q2StringPalindromeTestCase {
	
	@Test
	public void StringPalindromeTest() {
		
		assertEquals(true,Q2PalindromeString.StringPalindrome("nitin"));
		
	}

}
