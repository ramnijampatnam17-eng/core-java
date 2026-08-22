package com.javaintroduction;

public class LibraryBook {
	static int bookId;
	static String bookTitle;
	static String authorName;
	static int availableCopies;
	static String libraryName;
	static String librarianName;
	static void displayBookDetails() {
		System.out.println("****BOOK Detail****");
		int bookId=101;
		bookTitle="java";
		authorName = "srikanth";
		availableCopies = 4;
		System.out.println("bookid:"+ bookId);
		System.out.println("booktitle:"+ bookTitle);
		System.out.println("authorname:"+ authorName);
		System.out.println("availablecopies:"+ availableCopies);		
	}
	static void displayLibraryDetails() {
		System.out.println("****Library Detail****");
		libraryName = "abdul kalam";
		librarianName = "vishwa";
		System.out.println("libraryname:"+ libraryName);
		System.out.println("librarianname:"+ librarianName);
		
	}
	static void changeLibrarian(){
		librarianName = "sai kiran";
		System.out.println("librarianname:"+ librarianName);
	}

	public static void main(String[] args) {		
		displayBookDetails();
		displayLibraryDetails();
		changeLibrarian();
		
		
		
		
		

	}

}
