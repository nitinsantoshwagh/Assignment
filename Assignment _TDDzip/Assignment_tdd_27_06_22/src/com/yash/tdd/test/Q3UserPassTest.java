package com.yash.tdd.test;import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q3UserPass;


public class Q3UserPassTest {
	
	@Test
    public void test() {
        assertEquals(true, Q3UserPass.CheckEmailandPassword("vaibhav@gmail.com", "vaibhav123"));
    }

}
