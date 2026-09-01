package Interfaces;

public class Car implements Brake,Media,Engine{

	@Override
	public void acc() {
		System.out.println("I accelerate the car speed");
	}

	@Override
	public void start() {
		System.out.println("Starting the Car..!");
	}

	@Override
	public void stop() {
		System.out.println("Stop the car..!");
	}

	@Override
	public void brake() {
		System.out.println("Slowing the Car!");
	}

}
