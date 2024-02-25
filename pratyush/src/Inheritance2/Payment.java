package Inheritance2;

public class Payment extends Zaika {
float mob=3254128;
int amount=150;
void pin() {
	System.out.println("Enter pin.");
}
void orderplace() {
	System.out.println("Payment conformed.");
}
public static void main(String[] args) {
	Payment b=new Payment();
	System.out.println(b.name);
	System.out.println(b.mobno);
	b.press();
	b.login();
	System.out.println(b.name1);
	System.out.println(b.foodname1);
    b.order2();
	b.conformorder2();
	System.out.println(b.mob);
	System.out.println(b.amount);
	b.pin();
	b.orderplace();
	
}
}
