package com.javaintroduction;

public class TestDemo3 {
	static int x = 10;
	{
		x=50;
		System.out.println(x);
	}
	{
		x=60;
		System.out.println(x);
	}
	static {
		x=30;
		System.out.println(x);
	}
	static{
		x=20;
		System.out.println(x);
	}

	public static void main(String[] args) {
		TestDemo3 rm = new TestDemo3();
		System.out.println(x);


	}

}
