package com.javaintroduction;
import java.util.Scanner;
public class Constructorchaining2 {
	String model;
	int quantity;
	Double price;
	Double delivery_charges;
	Double mobile_cost;
	Double final_bill;
	public Constructorchaining2(String model) {
		this.model = model;
	}
	public Constructorchaining2(String model, int quantity) {
		this("model");
		this.quantity = quantity;
		this.price = price;
	}
	public Constructorchaining2(String model, int quantity, Double price) {
		this("model",2);
		this.mobile_cost=price*quantity;
		
	}	
	public Constructorchaining2(String model, int quantity, Double price, Double delivery_charges) {
		this("model",2,200000.0);
		this.delivery_charges = delivery_charges;
		this.final_bill=delivery_charges+mobile_cost;
	}
	public static void main(String[] args) {
		System.out.println("****main method started!!***");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER MOBILE MODEL:");
		String model=sc.nextLine();
		
		System.out.println("ENTER MOBILE QUANTITY:");
		int quantity=sc.nextInt();
		
		System.out.println("ENTER MOBILE PRICE:");
		Double price=sc.nextDouble();
		

		System.out.println("ENTER MOBILE DELIVERY_CHARGES:");
		Double delivery_charges=sc.nextDouble();
	
		
		Constructorchaining2 sr=new Constructorchaining2(model,quantity,price,delivery_charges);
		sr.mobile_details();
		

	}
	void mobile_details() {
		System.out.println("****MOBILE DETAILS***");
		System.out.println("ENTER MOBILE MODEL:"+model);
		System.out.println("ENTER MOBILE QUANTITY:"+quantity);
		System.out.println("ENTER MOBILE PRICE:"+price);
		System.out.println("ENTER MOBILE DELIVERY_CHARGES:"+delivery_charges);
		System.out.println("ENTER MOBILE MOBILE_COST:"+mobile_cost);
		System.out.println("ENTER MOBILE FIANL_BILL:"+final_bill);
	}	

}
