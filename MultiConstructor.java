package OOPS;

public class MultiConstructor {

	public static void main(String[] args) {
		// multiple constructor with multiple parameteres
		// overload constructor
		measurements measure;
		new measurements("sakthi");
		new measurements("sakthi",90);
		new measurements("praveen boomer",87,4.5f);
		measurements m=new measurements();
		m.run();
		
	}

}
 class measurements{
	 String name;
	 int age;
	 float hight;
	 double weight;
	 
	 void run() {
		 System.out.print("method called");
	 }
	 measurements(){
		 
	 }
	 measurements(String name)
	 {
		 this.name = name;
		 System.out.println(this.name);
	 }
	 
	 measurements(String name,int age)
	 {this.name = name;
	 this.age = age;
	 System.out.println(" ");
	 System.out.println(this.name);
	 System.out.println(this.age);
	 }
	 measurements(String name,int age,float hight)
	 {
	 this.name = name;
	 this.age = age;
	 this.hight=hight;
	 System.out.println(" ");
	 System.out.println(this.name);
	 System.out.println(this.age);
	 System.out.println(this.hight);
	 }
	 
}
