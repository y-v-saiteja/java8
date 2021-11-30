package java8assignment;
//given list of integers,find out all the even nos using stream


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,8,98,71,45,3,56,788,879,50);
		Stream<Integer> strm = list.stream();
		
		System.out.println(" List of integers: ");
		strm.forEach(System.out::println);
		
		System.out.println("Even numbers in list");
		List<Integer>li = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(li);
		
		
	}

}
