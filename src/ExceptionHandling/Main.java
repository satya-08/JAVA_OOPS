package ExceptionHandling;

public class Main {
	public static void main(String[] args) throws MyException {
		int a=10;
		int b=0;
//		int c=a/b; // It displays Arithmetic Exception(Unchecked)
		
		try {
//			throw new Exception();
//			divide(a,b);
			String name="satya";
			if(name.equals("satya")){
				throw new MyException("My name  is SATYA");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This will always execute");
		}
		
		
		
	}
	static int divide(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("Divide by zero is lead to out of bound");
		}
		return a/b;
	}
}
