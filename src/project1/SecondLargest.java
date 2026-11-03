package project1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 34, 1 };

		Optional<Integer> num = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println(num.get());
	}

}
