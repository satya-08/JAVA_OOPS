package StaticExample;

public class Main {
	public static void main(String[] args) {
		Human human1=new Human(25,"Narayana",30000,true);
		Human h1=new Human(21,"Satya",20000,false);
		System.out.println(Human.population);
//		greetings();
		
		
		Main obj=new Main();
		obj.fun2();
		
	}
	
	// Not depend on objects
	static void fun() {
//		greetings();
//		Main.greetings();
		
		//Call with object bcz greetings method is a non static method
		Main obj=new Main();
		obj.greetings();
		
	}
	
	//Here its works because fun2 is call by an object in anywhere in main class
	void fun2() {
		greetings();
	}
	
	// without static we use object for call this methods(any method without static)
	// Depends on objects
	void greetings() {
		//Here fun method works bcz it is static method
		//fun();
		System.out.println("Hii This is Good...!");
	}
	
}
