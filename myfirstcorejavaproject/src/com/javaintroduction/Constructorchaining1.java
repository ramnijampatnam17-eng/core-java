package com.javaintroduction;
//constuctor-chaining
public class Constructorchaining1 {
	String model;
	String brand;
	Double price;
	int year;
	String colour;
	
	Constructorchaining1(){
		System.out.println("no arg constructor!!");
		this("model","brand");
		
	}
	public Constructorchaining1(String model, String brand) {
		System.out.println("2-arg constructor!!");
		this("model","brand",300000.0);
	}
	public Constructorchaining1(String model, String brand,Double price) {
		System.out.println("3-arg constructor!!");
		this("model","brand",price,2012);	
	}
	public Constructorchaining1(String model, String brand, Double price, int year) {
		System.out.println("4-arg constructor!!");
		this("ns-200","hero",200000.0,2026,"white");
		
		
	}

	public Constructorchaining1(String model, String brand, Double price, int year, String colour) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.colour = colour;
	}


	public static void main(String[] args) {
		System.out.println("main method started!1");
		Constructorchaining1 sr=new Constructorchaining1("FZ-1","yamaha",200000.0,2022,"red");
		sr.bike();
		
		Constructorchaining1 rm=new Constructorchaining1();
		rm.bike();

	}
	void bike() {
		System.out.println("***bike details***");
		System.out.println("MODEL OF THE MODEL:"+model);
		System.out.println("MODEL OF THE BRAND:"+brand);
		System.out.println("MODEL OF THE PRICE:"+price);
		System.out.println("MODEL OF THE YEAR:"+year);
		System.out.println("MODEL OF THE COLOUR:"+colour);
	}

}
