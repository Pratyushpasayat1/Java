package inheritance;

public class Cosmetices extends Women {
String cosmeticesproduct="Cosmetices brand=Lakme";
void product6() {
	System.out.println(" Cosmetices Discount=30% discount.");
}
public static void main(String[] args) {
	Cosmetices d=new Cosmetices();
	System.out.println(d.brandname);
	System.out.println(d.womensbrand);
	System.out.println(d.cosmeticesproduct);
	d.product1();
	d.product5();
	d.product6();
}
}
