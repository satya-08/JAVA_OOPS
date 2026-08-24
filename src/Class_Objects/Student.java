package Class_Objects;

public class Student {
public static void main(String[] args) {
	Students st1=new Students();
	Students st2=new Students(103,"Anu",99);
//	st1.rno=83;
//	st1.name="Satya";
	st1.greeting();
	System.out.print(st1.rno+" ");
	System.out.print(st1.name+" ");
	System.out.println(st1.marks);
	System.out.println("Student 2: ");
	st2.greeting();
	System.out.print(st2.rno+" ");
	System.out.print(st2.name+" ");
	System.out.println(st2.marks);
	
	Students st3=new Students(87,"Kavya",99);
	Students st4=new Students(st3);
	Students st5=st4;
	st3.greeting();
	System.out.print(st3.rno+" ");
	System.out.print(st3.name+" ");
	System.out.println(st3.marks);
	System.out.println("Student 2: ");
	st4.greeting();
	st4.name="Viggu";
	System.out.print(st4.rno+" ");
	System.out.print(st4.name+" ");
	System.out.println(st4.marks);
	st4.greeting();
	System.out.print(st4.rno+" ");
	System.out.print(st4.name+" ");
	System.out.println(st4.marks);
	System.out.println("Student 2: ");
	
}


}

class Students{
	public Students(Students st3) {
		this.name=st3.name;
		this.rno=st3.rno;
		this.marks=st3.marks;
	}
	public void greeting() {
		System.out.println("Greeting for you "+this.name);
	}
	
	public Students(int rno, String name, int marks) {
		// TODO Auto-generated constructor stub
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	public Students() {
		// TODO Auto-generated constructor stub
		this(99,"Teja",90);
	}
	


	int rno;
	String name;
	float marks;
}
