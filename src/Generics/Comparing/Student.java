package Generics.Comparing;

public class Student implements Comparable<Student> {
	int marks;
	int rollno;
	public Student(int marks, int rollno) {
		super();
		this.marks = marks;
		this.rollno = rollno;
	}
	@Override
	public int compareTo(Student o) {
		int diff=(int)(this.marks-o.marks);
		return diff;
	}
	
	

}
