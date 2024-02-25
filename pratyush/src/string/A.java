package string;

public class A {
public static void main(String[] args) {
	String a="Let us play cricket";
	a.length();
	a.toUpperCase();
	a.toLowerCase();
	a.startsWith("Let");
	a.endsWith("ket");
	a.contains("play");
	a.concat("on saturday.");
	a.charAt(7);
	a.indexOf("p");
	a.substring(7);
	a.lastIndexOf("e");
	a.substring(1,15);
	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.startsWith("Let"));
	System.out.println(a.endsWith("ket"));
	System.out.println(a.contains("play"));
	System.out.println(a.concat(" on saturday."));
	System.out.println(a.charAt(7));
	System.out.println(a.indexOf("p"));
	System.out.println(a.substring(7));
	System.out.println(a.lastIndexOf("e"));
	System.out.println(a.substring(0,15));
    
	
	
}
}
