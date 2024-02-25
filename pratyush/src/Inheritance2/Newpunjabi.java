package Inheritance2;

public class Newpunjabi extends Zoomato {
String name1="Restro name=newpunjabi";
String foodname="Available food=vegbiryani,nonvegbiryani.";
void order1() {
	System.out.println("Selected=vegbiryani.");
}
void conformorder1() {
	System.out.println("order conformed.");
}
public static void main(String[] args) {
	Newpunjabi  a=new Newpunjabi();
	System.out.println(a.name);
	System.out.println(a.mobno);
	a.press();
	a.login();
	System.out.println(a.name1);
	System.out.println(a.foodname);
	a.order1();
	a.conformorder1();
}
}
