package newfeatures;

public class Student {

	int rollNumber;
	String name;
	double marks;
	
	public Student(int rollNumber, String name, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}
	
}