package com.javaintroduction;

public class RoundingNumber1 {
	public static void main(String[] args) {
		int[] arr= {99,91,78,75,82,68};
		for(int i=0;i<arr.length;i++) {
			int rem=arr[i]%10;
			if(rem>5) {
				arr[i]=arr[i]+(10-rem);
			}else{
				arr[i]=arr[i]-rem;
				
			}
			
		}
		for(int a:arr) {
			System.out.println(a +"");
		}

	}

}
