package com.javaintroduction;

public class TestDemo6 {
	int x=100;
	int y=100;
	public static void main(String[] args) {
		TestDemo6 t1 = new TestDemo6();
		TestDemo6 t2 = new TestDemo6();
		t2.x=200;
		t2.y=200;
		
		System.out.println("instance data:"+t1.x);
		System.out.println("instance data:"+t2.x);
		System.out.println("instance data:"+t1.y);
		System.out.println("instance data:"+t2.y);

		
		
		

	}

}
