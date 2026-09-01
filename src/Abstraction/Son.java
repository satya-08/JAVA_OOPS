package Abstraction;

public class Son extends Parent{

	Son(int age) {
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

}
