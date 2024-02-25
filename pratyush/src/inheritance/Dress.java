package inheritance;

public class Dress extends Women {
String dressproduct=" Brands=lv";
void product7() {
	System.out.println("Dress Discount=40% .");
}
 public static void main(String[] args) {
	Dress e=new Dress();
	System.out.println(e.brandname);
	System.out.println(e.womensbrand);
	System.out.println(e.dressproduct);
	e.product1();
	e.product5();
	e.product7();
}
}
