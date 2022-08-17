package OOPS;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap en = new encap("prabha",22,"7449150241");
		
		System.out.println("age is "+en.getAge());
		System.out.println("his name "+en.getName());
		System.out.println("his number is "+en.getNumber());
		
		System.out.println("--------------------------");
		encap en1 = new encap("prabha",22,"7449150241");
		en1.setAge(65);
		en1.setName("Sakthivel");
		en1.setNumber("8270139430");
	
		System.out.println("age is "+en1.getAge());
		System.out.println("his name "+en1.getName());
		System.out.println("his number is "+en1.getNumber());
		}

}
class encap{
	private String name;
	private int age;
	private String number;
	encap(String name,int age,String number)
	{this.setName(name);
	this. setAge(age);
	this.setNumber(number);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}