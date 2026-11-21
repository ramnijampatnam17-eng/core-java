package com.javaintroduction;

class Parent{
	void bike() {
		System.out.println("Normal bike-60kmph");
	}
	
}
class Child extends Parent{
	void bike() {
		System.out.println("my modified bike-120 kmph");
	}
	
}
public class Override1 {

	public static void main(String[] args) {
		Child r=new Child();
		r.bike();
		Parent p=new Parent();
		p.bike();
		Parent b=new Child();
		b.bike();
		
	}

}
