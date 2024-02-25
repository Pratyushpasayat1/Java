package upcasting;

public class B extends A {
String name="chiku";
void sub() {
	System.out.println(10-5);
}
public static void main(String[] args) {
A a=new B();
B b=(B)a;
System.out.println(b.age);
b.add();
System.out.println(b.name);
b.sub();
}
}
