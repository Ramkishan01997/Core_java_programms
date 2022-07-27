package day7;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 7, 9, 3, 5, 4, 100 };

		Scanner s = new Scanner(System.in);

		System.out.println(" Enter the number to search ");
		int num = s.nextInt();
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				System.out.println(num + " is present in array");
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println(num + " number is not present in array");
		}
	}

}
