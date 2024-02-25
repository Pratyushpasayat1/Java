package Array;
import java.util.Scanner;
public class laptop {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number of laptops.");
		int a=s.nextInt();
			double [] b=new double[a];
			for (int i=0;i<=b.length-1;i++) {
				System.out.println("Enter laptop price.");
				b [i]=s.nextDouble();
			
			}
			for (int j=0;j<=b.length-1;j++) {
				System.out.println(b[j]);
			}
}
}