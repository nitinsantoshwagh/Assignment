package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q11SingletonOrNot;

public class Q11SingletonTestCase {
	
	@Test
	public void singleton() {
		
		Q11SingletonOrNot instance1 = Q11SingletonOrNot.getInstance();
		Q11SingletonOrNot instance2 = Q11SingletonOrNot.getInstance();
	        System.out.println("checking singleton class objects equality");
	        assertEquals(true, instance1==instance2);
		
	}
}
