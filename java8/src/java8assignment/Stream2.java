package java8assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// nos starting with 1 using stream

public class Stream2 {


	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,23,11,45,15,64,19,22,17,16);
		Stream<Integer> strm = list.stream();
		
		System.out.println(" List of integers: ");
		strm.forEach(System.out::println);
		
		System.out.println("Numbers starting with 1: ");
		List<String>li = list.stream().map(i -> i+"").filter(i -> i.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(li);
	
	}

}
