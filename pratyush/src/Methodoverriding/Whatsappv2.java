package Methodoverriding;

public class Whatsappv2  extends whatsappV1{

	@Override
	void messeage() {
		
		System.out.println("Double Tick");
	}

	@Override
	void call() {

		System.out.println("Audio call");
		
	}

	
}
