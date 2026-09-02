package Generics;
import java.util.ArrayList;
import java.util.Arrays;
public class CustomArrayList {
	private int[] data;
	private int DEFAULT_SIZE=10;
	private static int size=0;
	
	public CustomArrayList() {
		data=new int[DEFAULT_SIZE];
	}
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size++]=num;
	}

	private void resize() {
		int[] temp=new int[data.length*2];
		for(int i=0;i<data.length;i++)
			temp[i]=data[i];
		data=temp;
	}

	private boolean isFull() {
		return data.length==size;
	}
	
	public int remove(){
		int removed=data[--size];
		return removed;
	}
	
	public int size() {
		return size;
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public void set(int index,int num) {
		data[index]=num;
	}
	
	
	@Override
	public String toString() {
		return "CustomArrayList [data=" + Arrays.toString(data) + ", DEFAULT_SIZE=" + DEFAULT_SIZE + "]";
	}
	public static void main(String[] args) {
		CustomArrayList list=new CustomArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.toString());
		ArrayList list1=new ArrayList();
		
	}

}
