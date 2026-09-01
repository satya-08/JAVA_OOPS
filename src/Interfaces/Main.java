package Interfaces;

public class Main{
	public static void main(String[] args) {
//		Engine car=new Car();
//		car.start();
//		car.acc();
//		car.stop();
//		// we can't access bcz car is reference of Engine
////		car.brake();
/// 

		NiceCar car=new NiceCar();
		car.start();
		car.startMedia();
		car.upgradeEngine(new ElectricEngine());
		car.start();
	}
}
