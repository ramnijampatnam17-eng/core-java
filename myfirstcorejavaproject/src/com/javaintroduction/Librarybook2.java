package com.javaintroduction;

public class Librarybook2 {
	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;
	String libraryname;
	String librarianname;
	void displaybookdetails() {
		System.out.println("***bookdetails***");
		System.out.println("BOOKID:"+bookid);
		System.out.println("BOOKTITLE:"+booktitle);
		System.out.println("AUTHOR:"+authorname);
		System.out.println("AVAILABLECOPIES:"+availablecopies);
		
	}
	void issuebook() {
		System.out.println("***reduce copies by 1***");
		availablecopies--;
		System.out.println("AVAILABLECOPIES:"+availablecopies);
		
	}
	void displaylibrarydetails() {
		System.out.println("***libraydetails****");
		System.out.println("LIBRARYNAME:"+libraryname);
		System.out.println("LIBRARIANNAME:"+librarianname);
		
	}
	void changelibrarian() {
		System.out.println("***changed labrarian name !");
		librarianname="ram";
		System.out.println("LIBRARIANNAME:"+librarianname);
		
	}
	static void method() {
		System.out.println("***new!***");
		Librarybook2 rm = new Librarybook2();
		rm.bookid=302;
		System.out.println("book:"+rm.bookid);
		
		
	}

	public static void main(String[] args) {
		Librarybook2 sr = new Librarybook2();
		sr.bookid=103;
		sr.booktitle="jai jawan";
		sr.authorname="srikanth";
		sr.availablecopies=3;
		sr.libraryname="ambedkar";
		sr.librarianname="sai";
		sr.displaybookdetails();
		sr.displaylibrarydetails();
		sr.issuebook();
		sr.changelibrarian();
		method();
		System.out.println("second method started!");
		
		
		
		// TODO Auto-generated method stub

	}

}
