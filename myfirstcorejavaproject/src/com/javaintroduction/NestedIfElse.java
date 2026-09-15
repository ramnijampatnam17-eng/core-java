package com.javaintroduction;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		System.out.println("welcome to malla reddy matrimonyyy!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your assets:");
		double assets=sc.nextDouble();
		
		System.out.println("Enter your salary:");
		double salary=sc.nextDouble();
		
		if(assets>=50000000.00 && salary>=25000.00) {
			System.out.println("okay go head!!");
			
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			
			if(age>=26 && age<=29) {
				System.out.println("our age is matched!!");
				
				System.out.println("Enter your height:");
				float height=sc.nextFloat();
				
				if(height>5.6 && height<=6.2) {
					System.out.println("our height is matched prabhaaa");
					
					System.out.println("Enter your weigth:");
					float weight=sc.nextFloat();
					
					if(weight>65 && weight<=75) {
						System.out.println("vadi body boxoffice!!");
						
						System.out.println("status of siblings:");
						boolean sib=sc.nextBoolean();
						
						if(!sib) {
							System.out.println("hammaiah!!");
						}else {
							System.out.println("ohh no");
						}
						
					}
					else {
						System.out.println("gym kii vellu maya!!!");
					}
				}else {
					System.out.println("pora pottoda!!");
				}
			}else {
				System.out.println("our age is not matched!! bye uncle");
			}
		}else {
			System.out.println("you may leave,you deserve better one");
		}
		
	}

}
