package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q7Palindrome;

public class Q7PalindromeTestCase {
	
//	@Test
//	public void PalindromeTestcase() {
//		
//		System.out.println("Palindrome Test Case");
//		assertEquals(1221, Q7_Palindrome.PalindromeOrNot(0));
//	}

	
	@Test
    public void test() {
        assertEquals(true,Q7Palindrome.palindromeCheck(1221));
    }
}
