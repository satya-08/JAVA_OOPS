package Generics;

import java.util.Arrays;

public class Wildcard<T extends Number> {
	
	private Object[] data;
	private int DEFAULT_SIZE=10;
	private static int size=0;
	
	public Wildcard() {
		data=new Object[DEFAULT_SIZE];
	}
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++]=num;
	}

	private void resize() {
		Object[] temp=new Object[data.length*2];
		for(int i=0;i<data.length;i++)
			temp[i]=data[i];
		data=temp;
	}

	private boolean isFull() {
		return data.length==size;
	}
	
	public T remove(){
		T removed=(T) data[--size];
		return removed;
	}
	
	public int size() {
		return size;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	
	public void set(int index,int num) {
		data[index]=num;
	}
	
	
	@Override
	public String toString() {
		return "CustomGenArrayList [data=" + Arrays.toString(data) + ", DEFAULT_SIZE=" + DEFAULT_SIZE + "]";
	}
	public static void main(String[] args) {
//		CustomArrayList list=new CustomArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		System.out.println(list.toString());
//		ArrayList list1=new ArrayList();
		
//		CustomGenArrayList<String> list=new CustomGenArrayList<String>();
//		list.add("satya");
//		list.add("anu");
////		list.add(10);
//		list.add("jannu");
//		list.add("pranay");
//		System.out.println(list.toString()+list.size());
//		list.remove();
//		System.out.println(list.toString()+list.size());
	
		
		// Not allowed only number tyoe and subclasses of number is allowed
//		Wildcard<String> list=new Wildcard<String>();
//		Wildcard<int> list=new Wildcard<>();
		
		Wildcard<Integer> list=new Wildcard<>();
		list.add(10);
		list.add(20);
//		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println(list.toString()+list.size());
		list.remove();
		System.out.println(list.toString()+list.size());

	}


}
