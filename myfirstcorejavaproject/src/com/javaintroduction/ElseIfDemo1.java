package com.javaintroduction;
import java.util.Scanner;
public class ElseIfDemo1 {
	Double marksp;

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR MARKSP:");
		double marksp=sc.nextDouble();
		
		if(marksp>100 || marksp<=0) {
			System.out.println("INVALID CREDENTIALS");
		}else if(marksp>=90) {
			System.out.println("GRADE A");
		}else if(marksp>=80) {
			System.out.println("GRADE B");
		}else if(marksp>=70) {
			System.out.println("GRADE C");
		}else if(marksp>=60) {
			System.out.println("GRADE D");
		}else if(marksp>=35) {
			System.out.println("YOUR FAIL");
		}else {
			System.out.println("GO HEAD!!");
		}
		

	}

}
