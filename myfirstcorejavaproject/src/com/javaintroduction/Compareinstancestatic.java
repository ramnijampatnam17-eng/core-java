package com.javaintroduction;

public class Compareinstancestatic {
	static int i=20;
	static String name="sai";
	int i2=40;
	String name2="ram";

	public static void main(String[] args) {	
		System.out.println(i);
		System.out.println(name);
		
		System.out.println(Compareinstancestatic.i);
		System.out.println(Compareinstancestatic.name);
		
		Compareinstancestatic sr = new Compareinstancestatic();
		System.out.println(sr.i);
		System.out.println(sr.name);
		
		Compareinstancestatic sr1 = new Compareinstancestatic();
		System.out.println(sr1.i2);
		System.out.println(sr1.name2);
		

		
		
		
		
		// TODO Auto-generated method stub

	}

}
