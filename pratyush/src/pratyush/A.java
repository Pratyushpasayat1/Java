package pratyush;



public class A {
static int a=20;
static int b=28;
public static void add()
{
	System.out.println(a+b);
}
static {
	a=23;
	b=29;
	System.out.println("welcome");
}
static {
	a=24;
	System.out.println("hii");
	
}
public static void main(String[] args) {
	System.out.println(A.a);
	System.out.println(A.b);
	A.add();
}
}
