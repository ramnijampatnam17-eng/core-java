package com.javaintroduction;

public class Movie2 {
	    int movieId;
	    String movieName;
	    String heroName;
	    int availableSeats;
	    static String theaterName;
	    static String managerName;
	    void displayMovieDetails() {
	        System.out.println("--- Movie Details ---");
	        System.out.println("MovieId: " + movieId);
	        System.out.println("MovieName: " + movieName);
	        System.out.println("HeroName: " + heroName);
	        System.out.println("AvailableSeats: " + availableSeats);
	    }
	    void bookSeat() {
	        if (availableSeats > 0) {
	            availableSeats--;
	            System.out.println("Seat booked for :" + movieName + ", remaining: " + availableSeats);
	        } else {
	            System.out.println("No seats available for " + movieName);
	        }
	    }

	    static void displayTheaterDetails() {
	        System.out.println("*** Theater Details ***");
	        System.out.println("TheaterName: " + theaterName);
	        System.out.println("ManagerName: " + managerName);
	    }
	    static void changeManager() {
	        managerName = "ram"; 
	        System.out.println("*** Manager changed! ***");
	    }

	    public static void main(String[] args) {
	        Movie2 m1 = new Movie2();
	        Movie2 m2 = new Movie2();
	        Movie2.theaterName = "Ambedkar Theater";
	        Movie2.managerName = "sai";

	        m1.movieId = 101;
	        m1.movieName = "RRR";
	        m1.heroName = "Ram Charan";
	        m1.availableSeats = 100;

	        m2.movieId = 102;
	        m2.movieName = "Devara";
	        m2.heroName = "NTR";
	        m2.availableSeats = 50;

	        Movie2.displayTheaterDetails();

	        m1.displayMovieDetails();
	        m2.displayMovieDetails();


	        m1.bookSeat();
	        m2.bookSeat();

	        System.out.println("After Booking:");
	        m1.displayMovieDetails();
	        m2.displayMovieDetails();

	        Movie2.changeManager();

	        Movie2.displayTheaterDetails();
	    }
	}
