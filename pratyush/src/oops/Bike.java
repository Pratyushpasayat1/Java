package oops;

public class Bike extends Vehicle {
String bikename="Hunter";
int price=150000;
void Bikestart() {
	System.out.println("Rahul sirs bike .");}
	void Bikestop() {
		System.out.println("stop bike.");
	}

public static void main(String[] args) {
	Bike c=new Bike();
	System.out.println(c.vehiclename);
	System.out.println(c.cost);
	System.out.println(c.bikename);
	System.out.println(c.price);
	c.vehiclestart();
	c.vehiclestop();
	c.Bikestart();
	c.Bikestop();
	
	
	
}
}
