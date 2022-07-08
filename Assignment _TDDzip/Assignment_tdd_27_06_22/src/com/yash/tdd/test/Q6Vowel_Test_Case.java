package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q6Vowel;

public class Q6Vowel_Test_Case {
	
	 @Test
	    public void test() {
	        assertEquals(true,Q6Vowel.VowelCount("Nitin"));
	    }
	    @Test
	    public void test1() {
	        assertEquals(true,Q6Vowel.VowelCount("Rama"));
	    }

	}


