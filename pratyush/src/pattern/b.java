package pattern;

public class b {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
