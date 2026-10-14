package com.javaintroduction;

public class ArrayMinMax {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr= {7,8,23,42,99,5,1,4};
		int min=arr[0];
		int max=arr[0];
//		for(int a:arr) {
//			if(a<min) {
//				min=a;
//			}else if(a>max) {
//				max=a;
//		}
//		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("minimum value of array:"+min);
		System.out.println("minimum value of array:"+max);
	}
}

