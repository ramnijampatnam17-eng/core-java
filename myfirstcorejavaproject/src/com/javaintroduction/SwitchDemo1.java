package com.javaintroduction;
import java.util.Scanner;
public class SwitchDemo1 {

	public static void main(String[] args) {
		System.out.println("main started!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter jursey no:");
		int number=sc.nextInt();
		switch(number) {
		case 18 ->System.out.println("greate player!!");
		case 7 ->System.out.println("my fav player");
		case 3->System.out.println("buddodu gattodu");
		default ->System.out.println("out of the jursey");
		}
		System.out.println("main ended!!");

		}

	}


