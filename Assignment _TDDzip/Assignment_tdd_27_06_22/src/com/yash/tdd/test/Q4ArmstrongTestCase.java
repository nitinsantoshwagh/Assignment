package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q4ArmstrongOrNot;

public class Q4ArmstrongTestCase {
	
	
	
	
	 @Test
     public void Armstrong_test() {

         assertEquals(true,Q4ArmstrongOrNot.armstrongnumber(153));
     }

 }
//	public void ArmstrongTestCase() {
//		System.out.println("Armstrong number test case ");
//		assertEquals(true, Q4_ArmstrongOrNot.Armstrong(370));
//	}


