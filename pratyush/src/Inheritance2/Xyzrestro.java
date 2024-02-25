package Inheritance2;

public class Xyzrestro extends Zoomato {
	String name2="Zaika";
	String foodname2="chickeen,fish.";
	void order3() {
		System.out.println("fish.");
	}
	void conformorder3() {
		System.out.println("order conformed.");
	}
	public static void main(String[] args) {
		Xyzrestro c=new Xyzrestro();
		System.out.println(c.name);
		System.out.println(c.mobno);
	c.press();
		c.login();
		System.out.println(c.name2);
		System.out.println(c.foodname2);
		c.order3();
		c.conformorder3();
	}
}
