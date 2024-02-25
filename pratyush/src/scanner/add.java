package scanner;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number.");
		int a=s.nextInt();
		System.out.println("Enter secound number.");
		int b= s.nextInt();
		
		int c=a+b;
		System.out.println("a+b="+c);
	}

}
