package com.javaintroduction;

public class Sumofintegers {

	public static void main(String[] args) {
		int[] number = {20,30,40,50};
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum = sum+number[i];
		}
		int avg=sum/number.length;
		System.out.println("SUM:"+sum);
		System.out.println("AVG:"+avg);
		
		
	}


	}


