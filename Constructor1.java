package OOPS;

public class Constructor1 {

	public static void main(String[] args) {
		Human h1 =new Human("Sakthi",35,101.43f); // class name and constructor
		Human h2 =new Human("prabha",22,67.5f);
		System.out.println("-----------------------------");	
		h1.work();
		h1.salary();
		System.out.println("-----------------------------");	
		h2.work();
		h2.salary();
		System.out.println("-----------------------------");	
	}
}
class Human{
	String name;
	int age;
	float weight;
	
	Human(String name,int age,float weight) // parameterized constructor
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
	void work()
	{
		System.out.println(this.name+" is a fullstack developer");
	}
	void salary()
	{
		System.out.println(this.name+" Expecting 4LPA salary");
	}
	
}