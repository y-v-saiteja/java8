package newfeatures;
//method reference -shorthand of lambda exp to call a method
@FunctionalInterface
interface MyInterface
{
	void myMethod();
}
class Test
{
	void display()
	{
		System.out.println("I am a Instance method");
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		//traditional approach
		Test t1= new Test();
		t1.display();
		
		//java8 method reference approach
		MyInterface m1ref=t1::display;//method reference instance method of an object (t1 here)
		
		//calling method of FI
		m1ref.myMethod();
	}
	//lambda ---> FI
	//MR----shorthand of lambda
	//MR---->FI

}
