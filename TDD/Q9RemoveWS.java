package com.yash.tdd;

public class Q9RemoveWS {
	
	public static String remove(String str) {
		
		//public static void main(String[] args) {
			
		
		//String str="This@#Red&car";
		str=str. replaceAll("[^a-zA-Z+d]", " ");
		System.out.println(str);
		
		
		return str;
		
		
	}

}
