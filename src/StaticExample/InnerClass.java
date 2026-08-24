package StaticExample;

//// Outer class we can access without object
//class Test{
//	// name is a static so value have the new value for all objects
//	static String name;
//
//	public Test(String name) {
////		super();
//		Test.name = name;
//	}
//}

// Outer classes is not a static 
public class InnerClass {
	
	// Test is a inner Class
	//Inner classes as static 
	// If inner class without static we should create an object to access
	static class Test{
		static String name;
		String name1;

		public Test(String name,String name1) {
//			super();
			Test.name=name;
			this.name1 = name1;
		}
//		Test(){
//			
//		}
		
		
	}
	public static void main(String[] args) {
		Test a=new Test("Satya","Satya");
		Test b=new Test("Anu","Anu");
		
		System.out.println(a.name);
		System.out.println(a.name1);
		System.out.println(b.name);
		System.out.println(b.name1);
	}

}
