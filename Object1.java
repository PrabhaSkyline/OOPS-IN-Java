package OOPS;

public class Object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College(); //object creation using class name
		c.dept(); //method calling by obj.
		c.year();
	}

}

class College{
	String department = "CSE";
	String name = "PRABHA";
	int age = 21;
	int yearOfStudy = 1;
	float marks = 77.6F;
	void dept()
	{
		System.out.println("Welcome to our Department");
	}
	void year()
	{
		if(yearOfStudy >=1) {
			System.out.println("Don't do engineering ");
			
		}
		else
		{
			System.out.println("Your HOD is so kind at all");
		}
	
	}
}