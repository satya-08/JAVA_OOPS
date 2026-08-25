package Inheritance;

public class Box {
	double l;
	double h;
	double w;
	
	Box(){
		l=-1;
		h=-1;w=-1;
	}
	
	// Cube
	Box(double size){
		this.l=size;
		this.w=size;
		this.h=size;
	}

	public Box(double l, double h, double w) {
		super(); //Object class
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	Box(Box old){
		this.l=old.l;
		this.h=old.h;
		this.w=old.w;
	}
	
	public void information() {
		System.out.println("Runnig the Box");
	}
	

}
