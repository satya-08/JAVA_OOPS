package Interfaces;

public class NiceCar {
	private Engine engine;
	private Media player;
	public NiceCar(Engine engine) {
//		super();
		this.engine = engine;
	}

	public NiceCar() {
		engine=new PowerEngine();
		player=new CDPlayer();
	}
	
	public void start() {
		engine.start();
	}
	
	public void stop() {
		engine.stop();
	}
	
	public void startMedia() {
		player.start();
	}
	
	public void stopMedia() {
		player.stop();
	}
	
	public void upgradeEngine(Engine engine) {
		this.engine=engine;
	}
}
