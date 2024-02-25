package inheritance;

public class Cloth extends Men {
String clothbrand=" Brand=Nike.";
void product3() {
	System.out.println(" Cloth Discount=30% discount.");
}
public static void main(String[] args) {
	Cloth a=new Cloth();
	System.out.println(a.brandname);
	System.out.println(a.mensbrand);
	System.out.println(a.clothbrand);
	a.product1();
	a.product2();
	a.product3();
}
}
