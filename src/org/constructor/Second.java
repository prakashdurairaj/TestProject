package org.constructor;

public class Second  extends First{
	public Second() {
		this("vicky");
		System.out.println("nnn");
		
	}
	
	
	public Second(String b) {
		this(20);
		System.out.println(b);
		
	}
	
	public Second(int b) {
		
		System.out.println(b);
		
		
	}
	
	
	public static void main(String[] args) {
		Second s = new Second();
	}
}
