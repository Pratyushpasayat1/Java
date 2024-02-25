package inheritance;

public class Kids extends Mesho {
String kidsbrand="Kids Brands=fistcry.";
void product4() {
	System.out.println("Discount=20% discount.");
}
public static void main(String[] args) {
	Kids c=new Kids();
	System.out.println(c.brandname);
	System.out.println(c.kidsbrand);
	c.product1();
	c.product4();
}
}
