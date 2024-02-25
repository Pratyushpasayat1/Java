package Array;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array=");
	int a=s.nextInt();
		int [] b=new int[a];
		for (int i=0;i<=b.length-1;i++) {
			System.out.println("Add the values of array=2");
			b [i]=s.nextInt();
		
		}
		for (int j=0;j<=b.length-1;j++) {
			System.out.println(b[j]);
		}
	
}
}

