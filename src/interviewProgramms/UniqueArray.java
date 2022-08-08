package interviewProgramms;

import java.util.HashSet;
import java.util.Set;

public class UniqueArray {

	public static void main(String[] args) {
	int a[]= {1,4,2,3,4,3,2,3};
	HashSet<Integer>set=new HashSet<>();
	
	for (int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
	System.out.println(set);

	
	
	
	String a1[]= {"ram","ram","kkooo","ojlkjklj","kkljlkjl"};
//	Set s1=new HashSet();
	HashSet<String> set1=new HashSet<>();
	for (int j=0;j<a1.length;j++) {
		set1.add(a1[j]);
	}
	System.out.println(set1);

}}
