package com.javaintroduction;

public class TestDemo4 {
	public static void main(String[] args) {
		String s = new String("sai");//new object--new address in heap
		String s1 = "sai";//literal address in string constant pool
		System.out.println(s == s1);
		System.out.println(s1 == s);
	}
}
