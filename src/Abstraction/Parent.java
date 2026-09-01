package Abstraction;
// we can't object for abstract class
public abstract class Parent {
//	we can use instance variables
	int age;
	final int val;
	static int childcount=0;
	// we can create constructors
	Parent(int age){
		this.age=age;
		val=143;
		this.childcount++;
	}
	// we can't  create abstract constructors
	// abstract static methods are not possible
	
	// We can do static method 
	public static void Hello() {
		System.out.println("Hello..!");
	}
	
	// we can create normal methods
	public void greeting() {
		System.out.println("Hii.. How are you?");
	}
	abstract void career(String name);
	abstract void partner(String name, int age);
	
	// If we place final before method then we can't override
	// we can't declare as final to abstract methods
	

}
