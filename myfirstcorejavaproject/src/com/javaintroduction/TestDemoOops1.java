package com.javaintroduction;
//Parent class
class Delivery {
 int deliveryId;
 String partnerName;
 double distance;

 Delivery(int deliveryId, String partnerName, double distance) {
     this.deliveryId = deliveryId;
     this.partnerName = partnerName;
     this.distance = distance;
 }

 double calculateDeliveryCharge() {
     return 0; // will be overridden
 }

 void display() {
     System.out.println("Delivery ID: " + deliveryId);
     System.out.println("Partner Name: " + partnerName);
     System.out.println("Distance: " + distance + " km");
 }
}

//Child 1
class BikeDelivery extends Delivery {
 BikeDelivery(int id, String name, double dist) {
     super(id, name, dist);
 }
 @Override
 double calculateDeliveryCharge() {
     return distance * 10;
 }
}

//Child 2
class CycleDelivery extends Delivery {
 CycleDelivery(int id, String name, double dist) {
     super(id, name, dist);
 }
 @Override
 double calculateDeliveryCharge() {
     return distance * 5;
 }
}

//Child 3
class ExpressDelivery extends Delivery {
 ExpressDelivery(int id, String name, double dist) {
     super(id, name, dist);
 }
 @Override
 double calculateDeliveryCharge() {
     return distance * 20;
 }
}

//Main class to test
public class TestDemoOops1 {
 public static void main(String[] args) {
     BikeDelivery bike = new BikeDelivery(101, "Rahul", 8);
     CycleDelivery cycle = new CycleDelivery(102, "Saini", 8);
     ExpressDelivery express = new ExpressDelivery(103, "Amit", 8);

     System.out.println("--- Bike Delivery ---");
     bike.display();
     System.out.println("Total Charge: Rs. " + bike.calculateDeliveryCharge());

     System.out.println("\n--- Cycle Delivery ---");
     cycle.display();
     System.out.println("Total Charge: Rs. " + cycle.calculateDeliveryCharge());

     System.out.println("\n--- Express Delivery ---");
     express.display();
     System.out.println("Total Charge: Rs. " + express.calculateDeliveryCharge());
 }
}