package OOPS;

public class Inheritance1 {

	public static void main(String[] args) {
		// Inheritance using Extends keyword
		// its used to inherit more than one class methods and its fields
		
common com = new common();
car car = new car();
cycle cycle = new cycle();

cycle.speed(2);
cycle.wheels("bicycle");

System.out.println("---------------------------------");

car.wheels("car");
car.speed(4);

	}

}
class common{
	String name ;
	int wheels;
	
	void wheels(String name) {
		System.out.println(name+" wheels are attched ");
	}
	void speed(int wheels)
	{
		System.out.println(wheels+" wheels so it has high speed");
	}
}

class cycle extends common{
 //int wheels= 2;
// String name = "Bicycle";
}

class car extends common{
	// int wheels= 4;
	 //String name = "Renault";
}