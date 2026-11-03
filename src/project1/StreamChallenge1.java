package project1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamChallenge1 {

	public static void main(String[] args) {
		EmployeeCollection ec = new EmployeeCollection();
		List<Employee> empList = ec.getEmployeeList();

		Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
		empMap.entrySet().stream().forEach(m -> System.out.println(m.getKey() + "====" + m.getValue()));
		System.out.println("===================================================");

		Map<Object, Long> depCoutMap = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
		System.out.println(depCoutMap);

		System.out.println("===================================================");

		Map<Object, Optional<Employee>> depCoutMap1 = empList.stream().collect(Collectors
				.groupingBy(e -> e.getDepartment(), Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary()))));
		System.out.println(depCoutMap1);
		
		String inp="swissr";
		
		List<String> words = List.of("cat", "dog", "apple", "tree", "sun", "banana", "kiwi");
		
		System.out.println(words.stream().collect(Collectors.groupingBy(w ->w.length())));
		
		System.out.println(words.stream().collect(Collectors.groupingBy(w ->w.length(), Collectors.counting())));
		System.out.println("===================================================");

		System.out.println(words.stream().collect(Collectors.groupingBy(w ->w.length(), Collectors.joining(","))));

		System.out.println(empList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.mapping(e -> e.getName(),Collectors.toList()))));
		System.out.println(empList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.summingInt(e ->e.getSalary()))));
		
		System.out.println("===================================================");

		List<List<String>> data = List.of(
		        List.of("Java", "Spring"),
		        List.of("Kafka", "Docker"));
		System.out.println(data);
		
		System.out.println(data.stream().flatMap(e ->e.stream()).toList());
	}

}
