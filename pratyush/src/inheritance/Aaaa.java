package inheritance;

import java.util.TreeSet;

public class Aaaa {
public static void main(String[] args) {
	TreeSet t=new TreeSet ();
	t.add(10);
	t.add(9);
	t.add(100);
	t.add(50);
	
	System.out.println(t);
	for (Object x:t) {
		System.out.println(x);
	}
		
	}
}

