package com.javaintroduction;

import java.util.Scanner;

public class ElseIfDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR BONUS SALARY:");
		double bsalary=sc.nextDouble();
		if(bsalary>10000||bsalary<=0) {
			System.err.println("invalid salary!!");
		}else if(bsalary>=8000) {
			System.out.println("BONUS 20%");
		}else if(bsalary>=6000) {
			System.out.println("BONUS 15%");
		}else if(bsalary>=4000) {
			System.out.println("BONUS 10%");
		}else if(bsalary>=2000) {
			System.out.println("BONUS 5%");
		
		}else {
			System.err.println("congratulation!!!");
		}
		
	}

}
