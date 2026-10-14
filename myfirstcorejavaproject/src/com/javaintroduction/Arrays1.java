package com.javaintroduction;

public class Arrays1 {

	public static void main(String[] args) {
		//declaration
		int[] ages;
		//creation
		ages=new int[10];
		//initialization
		ages[0]=21;
		ages[1]=22;
		ages[2]=23;
		ages[3]=24;
		ages[4]=24;
		ages[5]=24;
		ages[6]=21;
		ages[7]=21;
		ages[8]=25;
		ages[9]=26;
		//for each loop
		for(int age:ages) {
			if(age%2==0) {
			System.out.println(age);
		}

	}

}
}
