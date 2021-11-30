package newfeatures;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle car=new Car("BMW");

//invoke abstract methods
System.out.println(car.getBrand());
System.out.println(car.slowDown());
System.out.println(car.speedUp());



//invoke default methods
System.out.println(car.turnAlarmOn());
System.out.println(car.turnAlarmOff());
//invoke static method of interface
System.out.println(Vehicle.getHorsePower(2500,400));

	}

}
