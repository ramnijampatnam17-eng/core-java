package com.javaintroduction;

public class TestDemo3 {
	static int x = 10;
	static TestDemo3 rm = new TestDemo3();
	{
		System.out.println(x);
	}
	{
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
		System.out.println(x);


	}

}
