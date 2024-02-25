package Inheritance2;

public class Zaika extends Zoomato {
	String name1=" Resturant name=Zaika";
	String foodname1=" Available food=vegfriedrice,nonvegfriedrice.";
	void order2() {
		System.out.println("Selected food=Non-vegfriedrice.");
	}
	void conformorder2() {
		System.out.println("Order conformed.");
	}
	public static void main(String[] args) {
		Zaika  a1=new Zaika();
		System.out.println(a1.name);
		System.out.println(a1.mobno);
		a1.press();
		a1.login();
		System.out.println(a1.name1);
		System.out.println(a1.foodname1);
		a1.order2();
		a1.conformorder2();
}
}