package newfeatures;

import java.time.LocalDate;

//java 8 allows to  add functionality to interface
interface Parser{


	default void parse(){

		System.out.println("default Parsing logic");
}
static void displayDate()
{
	System.out.println(LocalDate.now());
}


}
class TextParser implements Parser{
	//inherit default implementation of parse
	
	
}
class XMLParser implements Parser{
	//overridden method
	public void parse(){

		System.out.println("Parsing XML files");
}
	
}

public class DefaultMethodDemo2 {

	public static void main(String[] args) {

		Parser p=new TextParser();//upcasting
		p.parse();//invoke default methods in interface
		
		p=new XMLParser();//reference  child class XMLParser
		p.parse();//invoke overridden method
		
		System.out.println("program executed on : ");
		Parser.displayDate();//invoke static method
	}

}