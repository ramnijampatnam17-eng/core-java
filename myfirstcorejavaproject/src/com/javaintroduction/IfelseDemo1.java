package com.javaintroduction;

import java.util.Scanner;
public class IfelseDemo1 {

	public static void main(String[] args){
		System.out.println("main method started");
		Scanner rm=new Scanner(System.in);
		System.out.println("enter your age:");
		int age = rm.nextInt();
		if(age>=18) {
			System.out.println("congratulation!!");
			System.out.println("your eligible for licence");
			
		}else {
			System.out.println("your not eligible!!");
			System.out.println("good bye");
		}
		System.out.println("method ended!!");
	}

}
