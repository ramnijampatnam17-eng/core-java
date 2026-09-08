package com.javaintroduction;

public class Movie1 {
	int movieid;
	String moviename;
	String heroname;
	int availableseats;
	String theatername;
	String managername;
	void displaymoviedetails() {
		System.out.println("**Movie Details***");
		System.out.println("MovieID:"+movieid);
		System.out.println("MovieName:"+moviename);
		System.out.println("HeroName:"+heroname);
		System.out.println("Availableseats:"+availableseats);
		
	}
	void bookseat() {
		System.out.println("**Bookseats***");
		availableseats--;
		System.out.println("Availableseats:"+availableseats);	
	}
	static void displaytheaterdetails() {
		System.out.println("**Theaterdetails**");
		Movie1 rm=new Movie1();
		rm.theatername="bhoojanga";
		rm.managername="kiran";
		System.out.println("TheaterName:"+rm.theatername);
		System.out.println("ManagerName:"+rm.managername);
		
		
	}
	static void changemanager() {
		System.out.println("***ChangeManager");
		Movie1 rm=new Movie1();
		rm.managername="Rajamouli";
		System.out.println("ChangedManger:"+rm.managername);
		
		
	}

	public static void main(String[] args) {
		Movie1 sr=new Movie1();
		sr.movieid=103;
		sr.moviename="Bahubali";
		sr.heroname="Prabhas";
		sr.availableseats=20;
		sr.theatername="Mallikarjuna";
		sr.managername="Ram";
		sr.displaymoviedetails();
		sr.bookseat();
		displaytheaterdetails();
		changemanager();
		Movie1 m1=new Movie1();
		m1.movieid=103;
		m1.moviename="Bahubali2";
		m1.heroname="rebal star";
		m1.availableseats=2;
		m1.theatername="Mallikarjuna";
		m1.managername="Ram";
		m1.displaymoviedetails();
		m1.bookseat();
		
		

		

	}

}
