package Methodoverriding;

public class bike extends vehicle {

	@Override
	void start() {
		System.out.println("bike start");
			}

	@Override
	void stop() {
		System.out.println("bike stop");
		
	}
public static void main(String[] args) {
	bike b = new bike();
	b.start();
	b.stop();
}
}
