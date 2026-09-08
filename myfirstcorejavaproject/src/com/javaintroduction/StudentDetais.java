package com.javaintroduction;

public class StudentDetais {
	String student_name;
	int age;
	short admissionyear;
	int rollnumber;
	long mobilenumber;
	int attendence;
	int totalfees;
	char grade;
	boolean pass_failstatus;
	long studentid;
	int fee_paid;
	public static void main(String[] args) {
		StudentDetais m1=new StudentDetais();
		m1.student_name="sai kiran";
		m1.age=22;
		m1.admissionyear=2026;
		m1.rollnumber=010;
		m1.mobilenumber=7893924326l;
		m1.attendence=90;
		m1.totalfees=20000;
		m1.grade='A';
		m1.pass_failstatus=true;
		System.out.println("STUDENTNAME:"+m1.student_name);
		System.out.println("AGE:"+m1.age);
		System.out.println("ADMISSIONYEAR:"+m1.admissionyear);
		System.out.println("ROLLNUMBER:"+m1.rollnumber);
		System.out.println("MOBILENUMBER:"+m1.mobilenumber);
		System.out.println("ATTENDENCE:"+m1.attendence);
		System.out.println("TOTALFEES:"+m1.totalfees);
		System.out.println("GRADE:"+m1.grade);
		System.out.println("PASS/FAIL:"+m1.pass_failstatus);
		
		
		// TODO Auto-generated method stub

	}

}
