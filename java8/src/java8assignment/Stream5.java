package java8assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// calculate max ,min, sum & avg of list elements
public class Stream5 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(16,355,78,67,9,8,34,67,56);
		Stream<Integer> stream = list.stream();
		
		int max =  list.stream().max(Integer::compare).get();
		System.out.println("Maximum Value : "+max);
		
		int min = list.stream().min(Integer::compare).get();
		System.out.println("Minimum Value : "+min);
		
		Integer sum = list.stream().reduce(0, Integer::sum);
		System.out.println("Sum : "+sum);
		
		list.stream().mapToInt(i ->i).average().ifPresent(avg -> System.out.println("Average " + avg));
		

	}

}
