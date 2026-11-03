package project1;

public class StringReverse {
	public static void main(String[] args) {
		
		String input="ENGLISH";
		
		System.out.println(input.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a,b)->b+a ));
		
	}

}
