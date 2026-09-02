package Generics.Comparing;

public class Main {
	public static void main(String[] args) {
		Student satya=new Student(101,90);
		Student anu=new Student(102,99);
		
		if(satya.compareTo(anu)<0) {
			System.out.println("anu has more marks");
		}
	}

}
