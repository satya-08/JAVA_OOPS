package Class_Objects;
class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person(Person person) {
//		super();
		this.age = person.age;
		this.name = person.name;
	}
	
	
}
public class Twins {
	public static void main(String[] args) {
//		Person p1=new Person(21,"satya");
//		Person p2=new Person(p1);
//		
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println();
//		p2.name="anu";
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println();
//		p1.name="ammu";
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p2.age);
//		System.out.println(p2.name);
		
		/*	21
		satya
		21
		satya
		
		21
		satya
		21
		anu
		
		21
		ammu
		21
		anu
	*/
		
		Person p1=new Person(21,"satya");
		Person p2=p1;
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p2.age);
		System.out.println(p2.name);
		System.out.println();
		p2.name="anu";
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p2.age);
		System.out.println(p2.name);
		System.out.println();
		p1.name="ammu";
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p2.age);
		System.out.println(p2.name);
	}

}
