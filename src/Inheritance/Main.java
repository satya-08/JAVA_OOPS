package Inheritance;

public class Main {
	public static void main(String[] args) {
//		Box box1=new Box(4);
		
//		Box box=new Box(4,5,6);
//		System.out.println(box.l+" "+box.h+" "+box.w);
		
//		BoxWeight box2=new BoxWeight();
//		BoxWeight box3=new BoxWeight(2,3,4,5);
//		System.out.println(box3.l+" "+box3.h+" "+box3.w+" "+box3.weight);
		
		
		Box box5=new BoxWeight(6,5,4,3);
		System.out.println(box5.h);
		
		// Not Possible parent clas s reference doesnot know about weight
//		System.out.println(box5.weight);
		
		
	
	}

}
