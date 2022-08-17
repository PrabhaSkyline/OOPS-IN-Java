package OOPS;

public class Interface1 {

	public static void main(String[] args) {
		// interface in java 
		// can inherit data from multiple classes
		
		c  c =new c();
		c.dancing();
		c.singing();

	}

}

interface  a{
	void singing();
}

interface b {
	void dancing();
}
 
class c implements a,b
{
	public void singing()
	{
		System.out.println("This is class a ");
	}
	
	public void dancing()
	{
		System.out.println("This is class b ");
	}
}