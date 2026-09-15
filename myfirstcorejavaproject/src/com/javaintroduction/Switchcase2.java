package com.javaintroduction;

import java.util.Scanner;

public class Switchcase2 {

	public static void main(String[] args) {
		System.out.println("main started!!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first no:");
		int n1=sc.nextInt();
		
		System.out.println("Enter your second no:");
		int n2=sc.nextInt();
		
		System.out.println("Enter your arthemetic symbols like +,-,*,/,%:");
		String symbl=sc.next();
		
		switch(symbl) {
		case "+"->System.out.println("sum of two numbers:"+(n1+n2));
		case "-"->System.out.println("sub of two numbers:"+(n1-n2));
		case "*"->System.out.println("mul of two numbers:"+(n1*n2));
		case "/"->System.out.println("qua of two numbers:"+(n1/n2));
		case "%"->System.out.println("div of two numbers:"+(n1%n2));
		
		}
		

	}

}
