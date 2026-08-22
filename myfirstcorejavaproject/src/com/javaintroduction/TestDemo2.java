package com.javaintroduction;

public class TestDemo2 {	
	static{
		System.out.println("static block1");
	}
	{
		System.out.println("instance block");
	}
	TestDemo2(){
		System.out.println("constructor calling!");
	}
	static{
		System.out.println("static block");
	}
	void heloo() {
		System.out.println("instance method");
	}
	static void hello() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		TestDemo2 sr = new TestDemo2();	
		sr.heloo();
		hello();

		{
			System.out.println("main method started!");
		}
		{
			System.out.println("main method ended!");
		}

	}

}
