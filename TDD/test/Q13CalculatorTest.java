package com.yash.tdd.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q13Calculator;

public class Q13CalculatorTest {

	@Test
	public void SumTest() {
		assertEquals(-8, Q13Calculator.getsum(-10, 2));
		assertEquals(12, Q13Calculator.getsum(10, 2));
		

	}

	@Test
	public void SubTest() {
		assertEquals(10, Q13Calculator.getsubstraction(20, 10));
		assertEquals(-40, Q13Calculator.getsubstraction(70, 110));

	}

	@Test
	public void MultiTest() {
		assertEquals(6, Q13Calculator.getmultiplication(2, 3));
		assertEquals(0, Q13Calculator.getmultiplication(0, 3));
	}

	@Test
	public void DivTest() {
		assertEquals(5, Q13Calculator.getdivision(10, 2));
	}

	@Test
	public void sqrtTest() {
		assertEquals(5, Q13Calculator.sqrt(25));
	}

	@Test
	public void cbrtTest() {
		assertEquals(3, Q13Calculator.cuberoot(27));
	}

	@Test
	public void powerTest() {
		assertEquals(32, Q13Calculator.power(2, 5));

	}
	@Test
	public void modulusTest() {
		assertEquals(5	, Q13Calculator.modulus(19, 7));
	}
}
