package com.cg.junit;

public class Strlen {
	public static void main(String[] args) {
		
		String name="preethi";
		int count=0;
		for(char n:name.toCharArray()) {
			count++;
		}
		System.out.println("The length of "+name+" is "+count);
	}
}
