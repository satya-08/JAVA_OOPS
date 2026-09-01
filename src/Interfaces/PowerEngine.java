package Interfaces;

public class PowerEngine implements Engine{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Power Engine started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Power engine stoped");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("Power engine accelerated");
	}


}
