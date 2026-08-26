package Polymorphism;

public class Numbers {
	int sum(int a,int b) {
		return a+b;
	}
	
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	void sum(String a,int b) {
//		return a+b;
	}
	
	void sum(int a,String b) {
		
	}
	
	double sum(double a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Numbers obj=new Numbers();
		obj.sum(10, 20);
		obj.sum(10, "satya");
		
	}
}
