package pratyush;

public class Blocks {

	static  int a;
	static {
		System.out.println("hii");
		a=20;
	}
	static{
	System.out.println("bye");
	a=30;
	}
	static {
		a=10;
	}
	static
	{
		System.out.println("hiiiii");
		
	}
	public static void main(String[] args) {
		System.out.println(Blocks.a);
	}
		
		

	

}
