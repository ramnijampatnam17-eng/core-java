package com.javaintroduction;
import java.util.Scanner;
public class HotelBooking {
    static double totalprice = 0;
    static double singleprice = 0;
    static double doubleprice = 0;
    static double suiteprice = 0;
    static double familyprice = 0;
    static double conferenceprice = 0;
    public static void main(String[] args) {
        System.out.println("WELCOME TO HOTEL ROOM BOOKING");
        Scanner sc = new Scanner(System.in);
        String yn;
        do {
            System.out.println("\nENTER THE ROOM CATEGORY:");
            String category = sc.next();
            switch (category) {
                case "single" -> {
                    String syn;
                    do {
                        System.out.println("ENTER THE ROOM TYPE:");
                        String room = sc.next();
                        switch (room) {
                            case "ac" -> {
                                System.out.println("AC Single Room price is 1500 rs");
                                double ac = 1500;
                                singleprice = singleprice + ac;

                            }
                            case "nonac" -> {
                                System.out.println("Non-AC Single Room price is 1000 rs");
                                double nonac = 1000;
                                singleprice = singleprice + nonac;
                            }
                            case "deluxe" -> {
                                System.out.println("Deluxe Single Room price is 2000 rs");
                                double deluxe = 2000;
                                singleprice = singleprice + deluxe;
                            }
                            default -> {
                                System.out.println("Entered single room type is not available");
                            }
                        }
                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH SINGLE ROOMS? ENTER Y OR N:"
                        );
                        syn = sc.next();
                    } while (syn.equalsIgnoreCase("Y"));
                    System.out.println("Exit from the single rooms!!");
                    System.out.println("Total single room price is: " + singleprice);
                }
                case "double" -> {
                    String dyn;
                    do {
                        System.out.println("ENTER THE ROOM TYPE:");
                        String room = sc.next();
                        switch (room) {
                            case "ac" -> {
                                System.out.println("AC Double Room price is 2500 rs");
                                double ac = 2500;
                                doubleprice = doubleprice + ac;
                            }
                            case "nonac" -> {
                                System.out.println("Non-AC Double Room price is 1800 rs");
                                double nonac = 1800;
                                doubleprice = doubleprice + nonac;
                            }
                            case "deluxe" -> {
                                System.out.println("Deluxe Double Room price is 3000 rs");
                                double deluxe = 3000;
                                doubleprice = doubleprice + deluxe;
                            }
                            default -> {
                                System.out.println("Entered double room type is not available");
                            }
                        }
                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH DOUBLE ROOMS? ENTER Y OR N:"
                        );
                        dyn = sc.next();
                    } while (dyn.equalsIgnoreCase("Y"));
                    System.out.println("Exit from the double rooms!!");
                    System.out.println("Total double room price is: " + doubleprice);
                }
                case "suite" -> {
                    String suyn;
                    do {
                        System.out.println("ENTER THE SUITE TYPE:");
                        String room = sc.next();
                        switch (room) {
                            case "normal" -> {
                                System.out.println("Normal Suite price is 4000 rs");
                                double normal = 4000;
                                suiteprice = suiteprice + normal;
                            }
                            case "luxury" -> {
                                System.out.println("Luxury Suite price is 6000 rs");
                                double luxury = 6000;
                                suiteprice = suiteprice + luxury;
                            }
                            case "premium" -> {
                                System.out.println("Premium Suite price is 8000 rs");
                                double premium = 8000;
                                suiteprice = suiteprice + premium;
                            }
                            default -> {
                                System.out.println("Entered suite type is not available");
                            }
                        }
                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH SUITES? ENTER Y OR N:"
                        );
                        suyn = sc.next();
                    } while (suyn.equalsIgnoreCase("Y"));
                    System.out.println("Exit from the suites!!");
                    System.out.println("Total suite price is: " + suiteprice);
                }
                case "family" -> {
                    String fyn;
                    do {
                        System.out.println("ENTER THE ROOM TYPE:");
                        String room = sc.next();
                        switch (room) {
                            case "ac" -> {
                                System.out.println("AC Family Room price is 3500 rs");
                                double ac = 3500;
                                familyprice = familyprice + ac;
                            }
                            case "nonac" -> {
                                System.out.println("Non-AC Family Room price is 2800 rs");
                                double nonac = 2800;
                                familyprice = familyprice + nonac;
                            }
                            case "deluxe" -> {
                                System.out.println("Deluxe Family Room price is 4500 rs");
                                double deluxe = 4500;
                                familyprice = familyprice + deluxe;
                            }
                            default -> {
                                System.out.println("Entered family room type is not available");
                            }
                        }
                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH FAMILY ROOMS? ENTER Y OR N:"
                        );
                        fyn = sc.next();
                    } while (fyn.equalsIgnoreCase("Y"));
                    System.out.println("Exit from the family rooms!!");
                    System.out.println("Total family room price is: " + familyprice);
                }
                case "conference" -> {
                    String cyn;
                    do {
                        System.out.println("ENTER THE CONFERENCE ROOM TYPE:");
                        String room = sc.next();
                        switch (room) {
                            case "small" -> {
                                System.out.println("Small Conference Room price is 5000 rs");
                                double small = 5000;
                                conferenceprice = conferenceprice + small;
                            }
                            case "medium" -> {
                                System.out.println("Medium Conference Room price is 7000 rs");
                                double medium = 7000;
                                conferenceprice = conferenceprice + medium;
                            }
                            case "large" -> {
                                System.out.println("Large Conference Room price is 10000 rs");
                                double large = 10000;
                                conferenceprice = conferenceprice + large;
                            }
                            default -> {
                                System.out.println(
                                    "Entered conference room type is not available"
                                );
                            }
                        }
                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH CONFERENCE ROOMS? ENTER Y OR N:"
                        );
                        cyn = sc.next();
                    } while (cyn.equalsIgnoreCase("Y"));
                    System.out.println("Exit from the conference rooms!!");
                    System.out.println(
                        "Total conference room price is: " + conferenceprice
                    );
                }
                default -> {
                    System.out.println(
                       "Entered room category is not available right now!!"
                    );
                }
            }
            totalprice = singleprice + doubleprice + suiteprice                    + familyprice + conferenceprice;
            System.out.println("\nDO YOU WANT TO CONTINUE BOOKING? ENTER Y OR N:");
            yn = sc.next();
        } while (yn.equalsIgnoreCase("Y"));
        System.out.println("==============================");
        System.out.println("Total single room price: " + singleprice);
        System.out.println("Total double room price: " + doubleprice);
        System.out.println("Total suite price: " + suiteprice);
        System.out.println("Total family room price: " + familyprice);
        System.out.println("Total conference room price: " + conferenceprice);
        System.out.println("Total booking price: " + totalprice);
        System.out.println("==============================");
        System.out.println("THANK YOU FOR BOOKING WITH US!");
        sc.close();
    }
}



