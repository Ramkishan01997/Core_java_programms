package day7;

import java.util.Arrays;

public class SortingArrayElemt {

	public static void main(String[] args) {

// sorting array element

		int a[] = { 2, 1, 5, 4, 2, 3, 7, 8 };

		System.out.println("before sorting the array  " + Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("array after sorting : " + Arrays.toString(a));

		// String type array

		String lang[] = { "java", "react", "selenium", "html", "css" };

		System.out.println(" array before sorting " + Arrays.toString(lang));
		Arrays.sort(lang);
		System.out.println(" array after sorting " + Arrays.toString(lang));

	}

}
