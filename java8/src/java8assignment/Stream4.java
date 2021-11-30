package java8assignment;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {

//Sorting
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(16,355,78,67,9,8,34,67,56);
		Stream<Integer> strm = list.stream();
		
		System.out.println("List of integers: ");
		strm.forEach(System.out::println);
		
		System.out.println("Sorted List: ");
		List<Integer>li = list.stream().sorted().collect(Collectors.toList());
		System.out.println(li);

	}

}


