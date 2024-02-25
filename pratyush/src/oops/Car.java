package oops;

public class Car extends Vehicle {
String carname="lamogini";
int Cost=10000000;
void carstart(){
	System.out.println("bhumm....");
}
void carstop() {
	System.out.println("s.t..o.....p.....");
}
public static void main(String[] args) {
	Car c1=new Car();
	System.out.println(c1.vehiclename);
	System.out.println(c1.Cost);
	System.out.println(c1.carname);
	System.out.println(c1.Cost);
	c1.vehiclestart();
	c1.vehiclestop();
	c1.carstart();
	c1.carstop();
}

}
