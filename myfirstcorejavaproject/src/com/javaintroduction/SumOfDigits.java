package com.javaintroduction;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("main started!");
		int sum =0;
		int n=120;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;		
		}
		System.out.print(sum);

	}

}
