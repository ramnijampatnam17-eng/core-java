
package com.javaintroduction;

import java.util.Scanner;

public class Nestedswitch {

    static double totalprice = 0;
    static double fruprice = 0;
    static double vegprice = 0;

    public static void main(String[] args) {

        System.out.println("WELCOME TO RYTHU BAZAAR");

        Scanner sc = new Scanner(System.in);

        String yn;

        do {
            System.out.println("\nENTER THE CATEGORY:");
            String caty = sc.next();

            switch (caty) {

                case "veg" -> {

                    String vyn;

                    do {
                        System.out.println("ENTER THE ITEM:");
                        String item = sc.next();

                        switch (item) {

                            case "tmt" -> {
                                System.out.println("Tomato price is 50 rs per kg");
                                double tomato = 50;
                                vegprice = vegprice + tomato;
                            }

                            case "ptt" -> {
                                System.out.println("Potato price is 60 rs per kg");
                                double potato = 60;
                                vegprice = vegprice + potato;
                            }

                            case "brj" -> {
                                System.out.println("Brinjal price is 70 rs per kg");
                                double brinjal = 70;
                                vegprice = vegprice + brinjal;
                            }

                            default -> {
                                System.out.println("Entered vegetable is not available");
                            }
                        }

                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH VEGETABLES? ENTER Y OR N:"
                        );
                        vyn = sc.next();

                    } while (vyn.equalsIgnoreCase("Y"));

                    System.out.println("Exit from the vegetables!!");
                    System.out.println("Total vegetable price is: " + vegprice);
                }

                case "frut" -> {

                    String fyn;

                    do {
                        System.out.println("ENTER THE FRUIT ITEM:");
                        String item = sc.next();

                        switch (item) {

                            case "grp" -> {
                                System.out.println("Grape price is 100 rs per kg");
                                double grape = 100;
                                fruprice = fruprice + grape;
                            }

                            case "apl" -> {
                                System.out.println("Apple price is 200 rs per kg");
                                double apple = 200;
                                fruprice = fruprice + apple;
                            }

                            case "bnn" -> {
                                System.out.println("Banana price is 100 rs per kg");
                                double banana = 100;
                                fruprice = fruprice + banana;
                            }

                            default -> {
                                System.out.println("Entered fruit is not available");
                            }
                        }

                        System.out.println(
                            "DO YOU WANT TO CONTINUE WITH FRUITS? ENTER Y OR N:"
                        );
                        fyn = sc.next();

                    } while (fyn.equalsIgnoreCase("Y"));

                    System.out.println("Exit from the fruits!!");
                    System.out.println("Total fruit price is: " + fruprice);
                }

                default -> {
                    System.out.println(
                        "Entered category is not available right now!!"
                    );
                }
            }

            totalprice = vegprice + fruprice;

            System.out.println("\nDO YOU WANT TO CONTINUE SHOPPING? ENTER Y OR N:");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

        System.out.println("==============================");
        System.out.println("Total vegetable price: " + vegprice);
        System.out.println("Total fruit price: " + fruprice);
        System.out.println("Total price: " + totalprice);
        System.out.println("==============================");
        System.out.println("THANK YOU FOR SHOPPING AT RYTHU BAZAAR!");

        sc.close();
    }
}

