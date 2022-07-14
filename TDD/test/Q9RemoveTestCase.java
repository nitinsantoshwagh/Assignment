package com.yash.tdd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Q9RemoveWS;

public class Q9RemoveTestCase {
	
	
	@Test
	public void Remove() {
		
		assertEquals(" Nitin Wagh Pune Lonar Hinjwadi ", Q9RemoveWS.remove("9Nitin%Wagh$Pune@Lonar@Hinjwadi1"));
	}

}