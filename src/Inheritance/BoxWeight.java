package Inheritance;

public class BoxWeight extends Box {
	double weight;
	
	public BoxWeight() {
		this.weight=-1;
		this.h=-1; // we can access from here if not possible if it is private modifier
	}

	public BoxWeight(double l, double h, double w, double weight) {
		super(l, h, w); // It calls the parent class constructor 
		
		System.out.println(this.h);
		System.out.println(super.h);
		
		this.weight = weight;
	}

}
