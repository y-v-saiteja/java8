package java8assignment;

//total nos of elements present in list
	import java.util.Arrays;
	import java.util.List;

	public class Stream3 {

		public static void main(String[] args) {
			
			List<Integer> list = Arrays.asList(16,355,78,67,9,8,34,67,56);
	        long count =  list.stream().count();
	        System.out.println("Total number : ");
	        System.out.println(count);
		

	}

}
