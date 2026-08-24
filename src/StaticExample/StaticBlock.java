package StaticExample;


// Initialization of static attributes and methods
public class StaticBlock {
	static int a=4;
	static int b;
	
	// Runs at the main class loaded at 1st object is created only once
	static {
		System.out.println("Hii your class Loaded");
		b=a*5;
	}
	
	public static void main(String[] args) {
		StaticBlock bl1=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);   //4 20
		StaticBlock.b+=5;
		StaticBlock bl2=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);   // 4 25
		
		
	}

}
