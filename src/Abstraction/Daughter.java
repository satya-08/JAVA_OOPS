package Abstraction;

public class Daughter extends Parent {
	Daughter(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	@Override
	void career(String name) {
		System.out.println("I want to become a Coder"+name);
	}
	@Override
	void partner(String name, int age) {
		System.out.println("I love "+name+" age:"+age);
	}
	@Override
	public void greeting() {
		System.out.println("Hello..! Its Daughter object");
	}
}
