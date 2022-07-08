package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q8EvenOrNot;

public class Q8EvenTestCase {
	
	@Test
	public void eventest() {
		
		assertEquals(true, Q8EvenOrNot.EvenCheck(2));
	}

}
