package project1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String inp = "nagulmeerang";

		Map<Character, Integer> linmap = new LinkedHashMap<>();

		for (char c : inp.toCharArray()) {
			linmap.put(c, linmap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : linmap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}	
		}
		*/
		
		  String str = "swisswri"; 
		  Optional<Character> result=str.chars().
				  mapToObj(c -> (char) c)
		  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
		  Collectors.counting()))
		  .entrySet().stream().filter(e ->e.getValue()
		  ==1).map(Map.Entry::getKey).findFirst(); System.out.println(result.get());
		 
		
		/*
		 * String str = "swiss";
		 * 
		 * Optional<Character> result = str.chars() .mapToObj(c -> (char) c)
		 * .collect(Collectors.groupingBy( Function.identity(), LinkedHashMap::new, //
		 * keeps insertion order Collectors.counting())) .entrySet().stream() .filter(e
		 * -> e.getValue() == 1) .map(Map.Entry::getKey) .findFirst();
		 * 
		 * System.out.println(result.orElse(null));
		 */
	}

}
