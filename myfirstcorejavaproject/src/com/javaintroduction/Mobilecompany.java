package com.javaintroduction;

public class Mobilecompany {
	String brand;
	String model;
	int price;
	int ram;

	void mobile1() {
		Mobilecompany sr = new Mobilecompany();
		sr.brand = "vivo";
		sr.model = "Xultra";
		sr.price = 30000;
		sr.ram = 16;
		System.out.println("***Brand1_details***");
		System.out.println("Brand:"+sr.brand);
		System.out.println("Brand:"+sr.model);
		System.out.println("Brand:"+sr.price);
		System.out.println("Brand:"+sr.ram);
	}
    static void mobile2() {
    	Mobilecompany rm = new Mobilecompany();
    	rm.brand = "redmi";
		rm.model = "Xultra";
		rm.price = 300000;
		rm.ram = 20;
		System.out.println("***brand_details***");
		System.out.println("Brand:"+rm.brand);
		System.out.println("Brand:"+rm.model);
		System.out.println("Brand:"+rm.price);
		System.out.println("Brand:"+rm.ram);
		
		
	}

	public static void main(String[] args) {
		Mobilecompany sa = new Mobilecompany();
		sa.mobile1();
		mobile2();

		// TODO Auto-generated method stub

	}

}
