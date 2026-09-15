package com.javaintroduction;
//🍔 Restaurant Ordering
//
//Categories:
//
//starters → fries, soup, paneer
//maincourse → biryani, friedrice, noodles
//desserts → icecream, cake, gulabjamun
//drinks → cola, lassi, juice
//fastfood → pizza, burger, sandwich
import java.util.Scanner;
public class Application1 {
	static double totalprice=0;
	static double startersprice=0;
	static double maincourseprice=0;
	static double dessertsprice=0;
	static double drinksprice=0;
	static double fastfood=0;

	public static void main(String[] args) {
		System.out.println("WELCOME TO VCUBE RESTAURANTS");
		Scanner sc=new Scanner(System.in);
		String yn=" ";
		
		do{
			System.out.println("Enter the category:");
		String caty = sc.next();
		
		switch(caty) {
		case"starters"->{
			System.out.println("Enter the item:");
			String item = sc.next();
			
			switch(item) {
			case"fries"->{
				System.out.println("The price of the fries is 350 per plate");
				double fries=350;
				startersprice=startersprice+fries;				
			}
			case"soup"->{
				System.out.println("The price of the soup is 250 per plate");
				double soup=250;
				startersprice=startersprice+soup;
			}
			default->{
				System.out.println("The item is not available!!");
			}
			}
			System.out.println("DO YOU WANT TO CONTINUE WITH STARTERS?ENTER Y OR N:");
			yn=sc.next();
		}
		}
		}while(yn.equalsIgnoreCase("Y"));
		System.out.println("Exit from the starterstable");
		System.out.println("total price of starters is:"+startersprice);
		}
		

	}


