package com.javaintroduction;
import java.util.Scanner;
public class PrimeNumber {
	static boolean IsPrime(int n) {
		boolean status=true;
		
		if(n==0 || n==1) {
			return false;
			for(int i=2;i<n;i++) {
				
			}
		}
		return status;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of prime numbers:");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i++) {
			if(IsPrime(i)) {
				System.out.println(i+ " ");
				System.out.println(count);
			}
		}

	}

}
