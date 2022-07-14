package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q15Item;



public class Q15ItemTestCase {
	
	@Test
    public void test() throws Exception {
		assertEquals(true, Q15Item.checkItem(11, "milk", 20, 25.50, "30/03/21", "01/03/22"));
       
    }

}


