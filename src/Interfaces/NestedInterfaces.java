package Interfaces;

class D{
	public interface nestedInteface{
		boolean isOdd(int num);
	}
}

class E implements D.nestedInteface{

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return (num&1)==1; 
	}
	
}

public class NestedInterfaces {
	public static void main(String[] args) {
		E e=new E();
		System.out.println(e.isOdd(7));
		System.out.println(e.isOdd(6));
	}
}
