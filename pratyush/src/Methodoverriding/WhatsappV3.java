package Methodoverriding;

public class WhatsappV3  extends Whatsappv2{
	
	

	@Override
	void messeage() {
		System.out.println("Blue Tick");
		
	}

	@Override
	void call() {
		System.out.println("Video call");
		}
	

	public static void main(String[] args) {
		WhatsappV3 w = new WhatsappV3();
		w.messeage();
		w.call();

	}

}
