package Access;

public class A {
//	int num;
	private int num;
	
	// We don't specify the access modifier soo It can belog's to Default access modifier
	String name;
	int[] arr;
	public A(int num, String name) {
		super();
		// num is private soo we use setNum method Setter method
		this.setNum(num);
		this.name = name;
		this.arr = new int[num];
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
