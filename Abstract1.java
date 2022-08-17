package OOPS;

public class Abstract1 {

	public static void main(String[] args) {
		// abstract is used to for security purpose like protecting methods and fields.

		person p =new person();
		p.run();
	}

}

abstract class sports // abstract class can't access by object 
{
	abstract void run(); // abstract method can't initialize 
}

class person extends sports
{
	void run() // method overriding happens here
	{
		System.out.println(" 100 meter race Strated");
	}
}