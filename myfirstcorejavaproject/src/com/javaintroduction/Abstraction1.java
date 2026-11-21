package com.javaintroduction;

interface ATM{
	void WITHDRAW();
}
class SBI implements ATM{
	public void WITHDRAW() {
		System.out.println("SBI LOGICS FOR WITHDRAW");
	}
}
class HDFC implements ATM{
	public void WITHDRAW() {
		System.out.println("HDFC LOGICS FOR WITHDRAW");
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		ATM b=new SBI();
		b.WITHDRAW();
		

	}

}
