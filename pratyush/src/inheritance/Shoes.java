package inheritance;

public class Shoes extends Men {
String shoobrand="Shooes Brand=Adidas.";
void product3() {
	System.out.println("Discount=50% discount.");
}
public static void main(String[] args) {
	Shoes b=new Shoes();
	System.out.println(b.brandname);
	System.out.println(b.mensbrand);
	System.out.println(b.shoobrand);
	b.product1();
	b.product2();
	b.product3();
}
}
