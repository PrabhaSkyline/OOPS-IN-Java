package OOPS;

import java.util.Scanner;

public class DynamicPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		volleyball1 volley;
		cricket1 cric;
		chess1 ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the game name ");
		System.out.println("(1 = volley), (2 = cricket), (3 = chess) ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			volley = new volleyball1();
			volley.run();
		}
		else if(choice == 2) {
			cric = new cricket1();
			cric.run();
		}
		else if(choice == 3) {
			ch = new chess1();
			ch.run();
		}
		else {
			System.out.println("you entered wrong input");
		}
		
}
void run() {
		
	}
}

class volleyball1 extends DynamicPoly{
	@Override
	public void run() {
		System.out.println("this is volley ball");
	}
}

class cricket1 extends DynamicPoly{
	@Override
	public void run() {
		System.out.println("this is cricket ");
	}
}

class chess1 extends DynamicPoly{
	@Override
	public void run() {
		System.out.println("this is chess ");
	}
}
