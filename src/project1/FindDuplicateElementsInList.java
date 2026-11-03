package project1;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarr= {1,2,2,3,3,4,5,9,8,8};
		
		System.out.println(Arrays.stream(intarr).boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
				.filter(e ->e.getKey()>=2).toString());

	}

}
