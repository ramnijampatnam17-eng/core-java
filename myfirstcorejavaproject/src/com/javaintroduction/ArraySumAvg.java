package com.javaintroduction;

public class ArraySumAvg {

	public static void main(String[] args) {
		int[] marks= {99,98,97,96,95,94};
		double sum=0;
		double avg=0;
		for(int m:marks) {
			sum=sum+m;
		}
		avg=sum/marks.length;
		System.out.println("sum of numbers:"+sum);
		System.out.println("avg of numbers:"+avg);
	}
	
}

