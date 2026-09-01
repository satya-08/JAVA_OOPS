package Interfaces;

public interface Engine {
//	by default final
	int price=78000;
	public void start();
	void stop();
	void acc();
	default void greet() {
		System.out.println("Hoii");
	}
	
	static void greet2() {
		System.out.println("Hii");
	}

}
