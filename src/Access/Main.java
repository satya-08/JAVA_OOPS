package Access;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		A obj=new A(10,"Satya");
		// num can't be accessed directly
		// Because it is declare with private keyword
//		System.out.println(obj.num);
		
		//  Private data members are accessed by using 
		//  Getter and Setter methods 
		System.out.println(obj.getNum());
		
		// 1. Access the data members
		// 2. Modify the data members
		
		
		ArrayList<Integer> arr=new ArrayList<>();
		// We can't access it because it is declare with Final Keyword
		//arr.DEFAULT_CAPACITY=100;
		
		System.out.println(arr.size());
	}

}
