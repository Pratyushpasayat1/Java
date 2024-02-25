package Array;

import java.util.Scanner;

public class footballfc {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the player size");
	int a=s.nextInt();
		String [] b=new String[a];
		for (int i=0;i<=b.length-1;i++) {
			System.out.println("Enter player name.");
			b [i]=s.next ();
		
		}
		for (int j=0;j<=b.length-1;j++) {
			System.out.println(b[j]);
		}
	
}
}
