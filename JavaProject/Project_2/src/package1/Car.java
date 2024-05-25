package package1;

public class Car extends Vehicle{
	public void drive()
	{
		super.drive();
		System.out.println("***Child Class****");
		System.out.println("Car Drives");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	
	}

}
