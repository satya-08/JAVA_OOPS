package StaticExample;

public class Human {
	int age;
	String name;
	double salary;
	boolean married;
	static int population;
	public Human(int age, String name, double salary, boolean married) {
//		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		population++;
	}
	Human(){
		
	}

}
