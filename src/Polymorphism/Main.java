package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Shape shape=new Shape();
		Circle circle=new Circle();
		Square square=new Square();
		Shape triangle =new Triangle();
		
		// This objects are override the parent class
//		shape.area();
		circle.area();
		
		// Triangle object calls the Shape area method bcz Triangle class doesn't have area method
		// So its call the super class method
		((Circle) triangle).area();
	}

}
