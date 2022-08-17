package OOPS;

public class Polymorphism1 {

	public static void main(String[] args) {
		// poly means many- morph means form polymorphism = manyforms...
		
		volleyball volley = new volleyball();
		cricket cric = new cricket();
		chess ch =new chess();
		
		Polymorphism1 [] game = {volley,cric,ch};
		for (Polymorphism1 x:game)
		{
			x.run();
		}

}
void run() {
		
	}
}

class volleyball extends Polymorphism1{
	@Override
	public void run() {
		System.out.println("this is volley ball");
	}
}

class cricket extends Polymorphism1{
	@Override
	public void run() {
		System.out.println("this is cricket ");
	}
}

class chess extends Polymorphism1{
	@Override
	public void run() {
		System.out.println("this is chess ");
	}
}
