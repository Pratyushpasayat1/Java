package chiku;

public class A {
public static void main(String[] args) {
	int n=8;
	 for (int i=1 ; i<=n ; i++)
	 {
		 for(int j=1 ; j<=n ; j++)
		 {
			if (i==1||j==1||i==n||j==n||i==j||i+j==n+1)
			{
				System.out.print("1 " );
			}
			else
			{
				System.out.print( "  ");
			}
		 }
System.out.println( );

}
}
}