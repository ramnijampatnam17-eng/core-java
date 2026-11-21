package com.javaintroduction;

public class TestDemoPoly1 {

	void main(String[] args) {
		System.out.println("main started");
		System.out.println(addition(20));
		System.out.println(addition(20,30));
	}
	double addition(double side) {
		System.out.println("square");
		return side*side;
		
	}
	double addition(double base,double height) {
		return 0.5*base*height;
	}

}
