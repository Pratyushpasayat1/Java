package Array;

import java.util.Scanner;

public class alphabet {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the character number.");
	int a=s.nextInt();
	char[]b=new char[a];
	for (int i=0;i<=b.length-1;i++) {
		System.out.println("Enter the alphabets.");
		b[i]=s.next().charAt(0);
		
	}
	for(int j=0;j<=b.length-1;j++){
		System.out.println(b[j]);
	
	}
}
}

