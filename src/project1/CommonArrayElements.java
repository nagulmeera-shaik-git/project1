package project1;

import java.util.HashSet;
import java.util.Set;

public class CommonArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		Set<Integer> set = new HashSet<>();
		for (int e : arr1) {
			set.add(e);
		}
		for (int e1 : arr2) {
			if (set.contains(e1)) {
				System.out.println(e1);
			}
		}

	}

}
