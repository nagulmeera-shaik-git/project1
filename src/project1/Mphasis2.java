package project1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Mphasis2 {
// reverse the string in word that is having length 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "this is node instance";

		// 1. Reverse the order of words → "instance node is this"
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s : words) {
			if (s.length() == 4) {
				sb.append(new StringBuilder(s).reverse() + " ");
			} else {
				sb.append(s + " ");
			}
		}
		System.out.println(sb);

		// using stream
		String output = Arrays.stream(input.split(" "))
				.map(w -> w.length() == 4 ? new StringBuilder(w).reverse() : w)
				.collect(Collectors.joining(" "));
		System.out.println(output);
	}

}
