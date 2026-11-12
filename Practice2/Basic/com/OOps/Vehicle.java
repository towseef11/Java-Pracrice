package com.OOps;


public class Vehicle {
      private String brand;
      
      public Vehicle() {}
      
      public Vehicle(String brand) {
    	      this.brand = brand;
      }
      
      public void start() {
    	    System.out.println(brand +"Starts !!");
      }
      
      public void displayDetails() {
    	    System.out.println("Vehicle brand is : "+brand);
      }
      
}

class Car extends Vehicle{
	private String name ; 
	
	public Car(String brand, String name) {
		super(brand);
		this.name = name;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Car nane is : "+name);
		
	}
	
	public static void main(String[] args) {
		Vehicle v = new Car("Toyota","Fortuner"); 
		v.displayDetails();
	}
}
