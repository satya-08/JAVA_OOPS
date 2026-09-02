package Generics;

import java.util.ArrayList;
import java.util.Iterator;


import java.util.*;

public class LambdaFunctions {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			arr.add(i*10);
		}
		
//		arr.forEach((item)->{
//			System.out.println(item);
//		});
//		
//		Consumer<Integer> fun=(item)->System.out.print(item+" ");
//		arr.forEach(fun);
		Operation sum=(a,b)->a+b;
		Operation prod=(a,b)->a*b;
		Operation div=(a,b)->a/b;
		
		LambdaFunctions fun=new LambdaFunctions();
		System.out.println(fun.operate(10, 20, sum));
		System.out.println(fun.operate(10, 2, div));
		
	
	}
	private int operate(int a,int b,Operation op) {
		return op.operation(a, b);
	}
}
interface Operation{
	int operation(int a,int b);
}