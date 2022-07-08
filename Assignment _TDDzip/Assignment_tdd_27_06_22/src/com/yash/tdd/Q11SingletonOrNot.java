package com.yash.tdd;

public class Q11SingletonOrNot {
	
	private static volatile Q11SingletonOrNot singletonInstance = new Q11SingletonOrNot();
	
	private Q11SingletonOrNot() {
		
	}
	
	public static Q11SingletonOrNot getInstance() {
		return singletonInstance;
	}

}
