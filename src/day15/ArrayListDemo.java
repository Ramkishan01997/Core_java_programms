package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//List myList=new ArrayList();// one way to define list
		ArrayList myList=new ArrayList();// second way
        //ArrayList<Integer> myList=new ArrayList<Integer>();
		myList.add(10);
		myList.add(10.5);
		myList.add("welcome");
		myList.add('A');
		myList.add(10);
		myList.add(null);
		myList.add(null);
		
		System.out.println(myList.size());
		
		System.out.println(myList);
		
		myList.remove(10.5);
		
		System.out.println(myList);
		
		System.out.println(myList.get(2));
		
		
		for (Object x:myList) {
			System.out.println(x);
		}
		
		myList.clear();
		System.out.println(myList);
		
	}

}
