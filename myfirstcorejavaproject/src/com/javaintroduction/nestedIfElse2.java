package com.javaintroduction;

import java.util.Scanner;

public class nestedIfElse2 {

	public static void main(String[] args) {
		System.out.println("welcome to online voting system!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		

		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("your are eligible for vote!!");
			
			System.out.println("Enter your gender:");
			char gen=sc.next().toUpperCase().charAt(0);
			
			if(gen=='M' || gen=='F') {
				System.out.println("your gender is ok!!");
				
				System.out.println("Enter your voter id:");
				String id=sc.next();
				
				if(id.isEmpty()) {
					System.out.println("invalid voter id");
					
				}else {
					System.out.println("candidates list");
					System.out.println("1.sai");
					System.out.println("2.ram");
					System.out.println("3.kiran");
					System.out.println("4.bala");
					
					System.out.println("choice the candidate:");
					int choice=sc.nextInt();
					switch(choice) {
					case 1->System.out.println("vote is captured by sai");
					case 2->System.out.println("vote is captured by ram");
					case 3->System.out.println("vote is captured by kiran");
					case 4->System.out.println("vote is captured by bala");
					}
				}
			}else {
				System.out.println("gender is not matchh");
			}
		}else {
			System.out.println("your are not eligible");
		}
		
	}

}
