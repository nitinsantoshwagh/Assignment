package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q1HCF;

public class Q1HCFtestcase {

	@Test
	public void getHCF_Test_case() {

		System.out.println("HCF test case");
		assertEquals(12, Q1HCF.getHCF(36, 60));
	}

}
