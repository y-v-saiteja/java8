package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Filter Operations on Stream

public class StreamExample2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("John","Dan","Mike","Johnson");
		
		//create a stream ---> Operations--->convert stream back to collections
Stream<String> n=names.stream();
		
		Stream<String> ln=n.filter(str->str.length() >3);
		ln.forEach(System.out::println);
		
		System.out.println("****************************************");
		List<String> names1=names.stream().filter(str->str.length() >4).collect(Collectors.toList());
		System.out.println(names1);
		System.out.println("*********************");
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);
		
		//build stream from collections
		
		Stream<Integer> strm1=grades.stream();
		
		//filter only even grades
		
		List<Integer> gradesEven=strm1.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(gradesEven);
		
	}

}
