package Abstraction;

public class Main {
	public static void main(String[] args) {
		Son son=new Son(21);
		son.career("Software Developer");
		son.partner("Satya",21);
		
		Daughter dau=new Daughter(21);
		dau.career("Dacing");
		dau.partner("Anu",19);
		Parent.Hello();
		son.greeting();
		
		// Override the parent class
		dau.greeting();
	}

}
