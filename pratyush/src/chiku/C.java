package chiku;

public class C {
public static void main(String[] args) {
	int mobilenumber =123;          // nested if
	int password=456;
	if (mobilenumber==123) {
		if (password==456) {
			System.out.println("login.");
		}
		else {
			System.out.println("incorect password.");
		}
	}
	else {
		System.out.println("incorect mobile number.");
	}
	
		
	}
}

