package com.javaintroduction;

public class TestDemo4 {
	int x=10;
	{
		System.out.println(x);
	}
	{
		x=30;
		System.out.println(x);
	}
	{
		x=20;
		System.out.println(x);
	}


	public static void main(String[] args) {
	    TestDemo4 sr = new TestDemo4();
	    System.out.println("X:"+sr.x);
	}

}
