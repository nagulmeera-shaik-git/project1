package project1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddSegregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e % 2 == 0)).entrySet().stream()
				.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		List<Integer>arl=Arrays.stream(arr).boxed().filter(e ->e % 2 == 0).toList();
		System.out.println(arl);
	}

}
