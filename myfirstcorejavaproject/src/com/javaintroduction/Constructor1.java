package com.javaintroduction;
//no-arg and parameterized constructor
public class Constructor1 {
	int roll_number;
	String name;
	int age;
	public Constructor1() {
		System.out.println("no-arg constructor!!");
		
	}
	public Constructor1(int roll_number, String name, int age) {
		System.out.println("*****3 arg constructor!!*******");
		this.roll_number = roll_number;
		this.name = name;
		this.age = age;
		System.out.println("ROLLNO:"+roll_number);
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
	}


	public static void main(String[] args) {
		System.out.println("main method started!!");
		Constructor1 rm = new Constructor1();
		rm.roll_number=101;
		rm.name="ravi";
		rm.age=22;
		rm.student1();
		
		Constructor1 sr = new Constructor1(101,"ram",22);
		sr.student1();

	}
	void student1() {
		System.out.println("*******method***");
		System.out.println("ROLLNO:"+roll_number);
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
	}

}
