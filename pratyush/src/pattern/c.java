package pattern;

public class c {
public static void main(String[] args) {
	int []a= {10,20,30,40};
	
	try {
		try {
			System.out.println(100);
		}
		catch(Exception e){
			System.out.println(e.getMessage());    //nested try catch block
		}
		System.out.println(10/0);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		
	}
}
}
