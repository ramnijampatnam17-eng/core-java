package com.javaintroduction;

import java.util.Arrays;

public class TestDsa3 {

	public static void main(String[] args) {
		int[] arr = {30,40,50,60,70};
		int temp=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
		}
	}


